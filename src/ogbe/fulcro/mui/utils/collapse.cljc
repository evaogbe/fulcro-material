(ns ogbe.fulcro.mui.utils.collapse
  #?(:cljs (:require
            ["@mui/material/Collapse" :default Collapse]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-collapse #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Collapse)))
