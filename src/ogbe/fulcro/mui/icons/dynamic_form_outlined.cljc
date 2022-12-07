(ns ogbe.fulcro.mui.icons.dynamic-form-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DynamicFormOutlined" :default DynamicFormOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dynamic-form-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DynamicFormOutlined)))