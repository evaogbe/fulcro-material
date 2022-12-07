(ns ogbe.fulcro.mui.icons.table-bar-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TableBarOutlined" :default TableBarOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-bar-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableBarOutlined)))