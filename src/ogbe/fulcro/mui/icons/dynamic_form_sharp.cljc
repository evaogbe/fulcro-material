(ns ogbe.fulcro.mui.icons.dynamic-form-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFormSharp" :default DynamicFormSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-form-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFormSharp)))