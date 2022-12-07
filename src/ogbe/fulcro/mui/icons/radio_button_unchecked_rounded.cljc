(ns ogbe.fulcro.mui.icons.radio-button-unchecked-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RadioButtonUncheckedRounded" :default RadioButtonUncheckedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-button-unchecked-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioButtonUncheckedRounded)))