(ns ogbe.fulcro.mui.navigation.step
  #?(:cljs (:require
            ["@mui/material/Step" :default Step]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-step #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Step)))
