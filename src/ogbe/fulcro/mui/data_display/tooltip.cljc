(ns ogbe.fulcro.mui.data-display.tooltip
  #?(:cljs (:require
            ["@mui/material/Tooltip" :default Tooltip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tooltip #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Tooltip)))
