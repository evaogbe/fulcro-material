(ns ogbe.fulcro.mui.icons.schema-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SchemaSharp" :default SchemaSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schema-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SchemaSharp)))