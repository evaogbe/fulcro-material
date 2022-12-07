(ns ogbe.fulcro.mui.icons.table-restaurant
  #?(:cljs (:require
            ["@mui/icons-material/TableRestaurant" :default TableRestaurant]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-table-restaurant
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TableRestaurant)))