(ns ogbe.fulcro.mui.icons.table-bar-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TableBarRounded" :default TableBarRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-bar-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableBarRounded)))