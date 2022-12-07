(ns ogbe.fulcro.mui.icons.dynamic-form-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFormTwoTone" :default DynamicFormTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-form-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFormTwoTone)))