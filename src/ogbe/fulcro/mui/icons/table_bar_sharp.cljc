(ns ogbe.fulcro.mui.icons.table-bar-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TableBarSharp" :default TableBarSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-bar-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableBarSharp)))