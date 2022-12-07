(ns user
  (:require
   [clojure.java.io :as io]
   [cuerdas.core :as str]))

(defn icon-fn-str
  [icon-name]
  (str "(def ui-icon-" (str/kebab icon-name) "
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory " icon-name ")))"))

(defn icons-file-contents
  [icons]
  (str "(ns ogbe.fulcro.mui.icons
  #?(:cljs
     (:require
      [\"@mui/icons-material\" :refer [" (str/join " " icons) "]]
      [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

"
       (str/join "\n" (map icon-fn-str icons))))

(defn icon-file-contents
  [icon-name]
  (str "(ns ogbe.fulcro.mui.icons." (str/kebab icon-name) "
  #?(:cljs (:require
            [\"@mui/icons-material/" icon-name "\" :default " icon-name "]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

"
       (icon-fn-str icon-name)))

(defn write-icons!
  []
  (let [icon-names (->> (io/file "node_modules/@mui/icons-material")
                        (.list)
                        (keep #(->> % (re-find #"(\w+)\.js$") second)))]
    (spit "src/ogbe/fulcro/mui/icons.cljc" (icons-file-contents icon-names))
    (doseq [icon-name icon-names
            :let [filename (str "src/ogbe/fulcro/mui/icons/" (str/snake icon-name) ".cljc")
                  contents (icon-file-contents icon-name)]]
      (spit filename contents))
    :written))

(comment
  (write-icons!)
  )
