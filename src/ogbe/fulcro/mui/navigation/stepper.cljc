(ns ogbe.fulcro.mui.navigation.stepper
  #?(:cljs (:require
            ["@mui/material/Stepper" :default Stepper]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-stepper #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Stepper)))
