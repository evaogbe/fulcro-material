(ns ogbe.fulcro.mui.icons.text-fields-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TextFieldsOutlined" :default TextFieldsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-fields-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextFieldsOutlined)))