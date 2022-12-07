(ns ogbe.fulcro.mui.inputs.radio
  #?(:cljs (:require
            ["@mui/material/Radio" :default Radio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-radio #?(:clj  (fn [& _args])
                 :cljs (interop/react-input-factory Radio)))
