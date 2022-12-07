(ns ogbe.fulcro.mui.navigation.step-content
  #?(:cljs (:require
            ["@mui/material/StepContent" :default StepContent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-step-content #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory StepContent)))
