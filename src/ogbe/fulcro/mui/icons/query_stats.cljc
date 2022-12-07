(ns ogbe.fulcro.mui.icons.query-stats
  #?(:cljs (:require
            ["@mui/icons-material/QueryStats" :default QueryStats]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-query-stats
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueryStats)))