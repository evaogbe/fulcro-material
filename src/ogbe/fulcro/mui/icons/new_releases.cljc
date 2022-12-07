(ns ogbe.fulcro.mui.icons.new-releases
  #?(:cljs (:require
            ["@mui/icons-material/NewReleases" :default NewReleases]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-new-releases
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NewReleases)))