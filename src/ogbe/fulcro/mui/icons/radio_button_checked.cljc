(ns ogbe.fulcro.mui.icons.radio-button-checked
  #?(:cljs (:require
            ["@mui/icons-material/RadioButtonChecked" :default RadioButtonChecked]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-button-checked
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioButtonChecked)))