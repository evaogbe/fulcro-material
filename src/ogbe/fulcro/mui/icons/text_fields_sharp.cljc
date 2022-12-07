(ns ogbe.fulcro.mui.icons.text-fields-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TextFieldsSharp" :default TextFieldsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-fields-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextFieldsSharp)))