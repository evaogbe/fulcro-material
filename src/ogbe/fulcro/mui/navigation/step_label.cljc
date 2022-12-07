(ns ogbe.fulcro.mui.navigation.step-label
  #?(:cljs (:require
            ["@mui/material/StepLabel" :default StepLabel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-step-label #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory StepLabel)))
