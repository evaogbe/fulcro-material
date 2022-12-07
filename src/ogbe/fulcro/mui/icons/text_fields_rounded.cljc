(ns ogbe.fulcro.mui.icons.text-fields-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TextFieldsRounded" :default TextFieldsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-text-fields-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextFieldsRounded)))