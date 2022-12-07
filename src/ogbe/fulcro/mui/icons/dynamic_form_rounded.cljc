(ns ogbe.fulcro.mui.icons.dynamic-form-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFormRounded" :default DynamicFormRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-form-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFormRounded)))