(ns ogbe.fulcro.mui.icons.mode-fan-off
  #?(:cljs (:require
            ["@mui/icons-material/ModeFanOff" :default ModeFanOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-fan-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeFanOff)))