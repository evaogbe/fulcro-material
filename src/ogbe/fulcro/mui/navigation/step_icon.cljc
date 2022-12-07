(ns ogbe.fulcro.mui.navigation.step-icon
  #?(:cljs (:require
            ["@mui/material/StepIcon" :default StepIcon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-step-icon #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory StepIcon)))
