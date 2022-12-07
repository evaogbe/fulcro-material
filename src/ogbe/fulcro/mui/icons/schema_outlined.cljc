(ns ogbe.fulcro.mui.icons.schema-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SchemaOutlined" :default SchemaOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schema-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SchemaOutlined)))