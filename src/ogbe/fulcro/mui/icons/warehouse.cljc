(ns ogbe.fulcro.mui.icons.warehouse
  #?(:cljs (:require
            ["@mui/icons-material/Warehouse" :default Warehouse]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warehouse
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Warehouse)))