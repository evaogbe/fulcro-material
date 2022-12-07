(ns ogbe.fulcro.mui.icons.query-builder
  #?(:cljs (:require
            ["@mui/icons-material/QueryBuilder" :default QueryBuilder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-query-builder
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueryBuilder)))