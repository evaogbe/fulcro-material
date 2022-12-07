(ns ogbe.fulcro.mui.data-display.table
  #?(:cljs (:require
            ["@mui/material/Table" :default Table]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-table #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Table)))
