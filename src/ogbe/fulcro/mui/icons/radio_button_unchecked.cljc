(ns ogbe.fulcro.mui.icons.radio-button-unchecked
  #?(:cljs (:require
            ["@mui/icons-material/RadioButtonUnchecked" :default RadioButtonUnchecked]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-button-unchecked
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioButtonUnchecked)))