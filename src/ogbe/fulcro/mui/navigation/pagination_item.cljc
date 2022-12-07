(ns ogbe.fulcro.mui.navigation.pagination-item
  #?(:cljs (:require
            ["@mui/material/PaginationItem" :default PaginationItem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-pagination-item #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory PaginationItem)))
