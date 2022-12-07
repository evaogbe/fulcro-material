(ns ogbe.fulcro.mui.navigation.mobile-stepper
  #?(:cljs (:require
            ["@mui/material/MobileStepper" :default MobileStepper]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-mobile-stepper #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory MobileStepper)))
