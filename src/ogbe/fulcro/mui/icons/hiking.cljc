(ns ogbe.fulcro.mui.icons.hiking
  #?(:cljs (:require
            ["@mui/icons-material/Hiking" :default Hiking]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hiking
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hiking)))