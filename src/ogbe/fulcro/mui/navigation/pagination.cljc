(ns ogbe.fulcro.mui.navigation.pagination
  #?(:cljs (:require
            ["@mui/material/Pagination" :default Pagination]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-pagination #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory Pagination)))
