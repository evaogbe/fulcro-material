(ns ogbe.fulcro.mui.icons.query-builder-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QueryBuilderSharp" :default QueryBuilderSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-query-builder-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueryBuilderSharp)))