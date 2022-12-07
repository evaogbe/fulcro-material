(ns ogbe.fulcro.mui.navigation.step-connector
  #?(:cljs (:require
            ["@mui/material/StepConnector" :default StepConnector]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-step-connector #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory StepConnector)))
