(ns ogbe.fulcro.mui.navigation.step-button
  #?(:cljs (:require
            ["@mui/material/StepButton" :default StepButton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-step-button #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory StepButton)))
