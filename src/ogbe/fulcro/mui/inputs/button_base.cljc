(ns ogbe.fulcro.mui.inputs.button-base
  #?(:cljs (:require
            ["@mui/material/ButtonBase" :default ButtonBase]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-button-base #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory ButtonBase)))
