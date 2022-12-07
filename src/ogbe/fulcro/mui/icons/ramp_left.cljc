(ns ogbe.fulcro.mui.icons.ramp-left
  #?(:cljs (:require
            ["@mui/icons-material/RampLeft" :default RampLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ramp-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RampLeft)))