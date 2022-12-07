(ns ogbe.fulcro.mui.icons.sailing
  #?(:cljs (:require
            ["@mui/icons-material/Sailing" :default Sailing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sailing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sailing)))