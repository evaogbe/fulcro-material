(ns ogbe.fulcro.mui.inputs.button
  #?(:cljs (:require
            ["@mui/material/Button" :default Button]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-button #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Button)))
