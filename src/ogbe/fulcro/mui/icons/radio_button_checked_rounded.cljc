(ns ogbe.fulcro.mui.icons.radio-button-checked-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RadioButtonCheckedRounded" :default RadioButtonCheckedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-button-checked-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioButtonCheckedRounded)))