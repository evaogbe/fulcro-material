(ns ogbe.fulcro.mui.icons.schema-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SchemaRounded" :default SchemaRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schema-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SchemaRounded)))