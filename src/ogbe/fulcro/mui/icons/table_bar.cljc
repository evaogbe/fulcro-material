(ns ogbe.fulcro.mui.icons.table-bar
  #?(:cljs (:require
            ["@mui/icons-material/TableBar" :default TableBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableBar)))