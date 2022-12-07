(ns ogbe.fulcro.mui.data-display.divider
  #?(:cljs (:require
            ["@mui/material/Divider" :default Divider]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-divider #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Divider)))
