(ns ogbe.fulcro.mui.icons.inventory-outlined
  #?(:cljs (:require
            ["@mui/icons-material/InventoryOutlined" :default InventoryOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inventory-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InventoryOutlined)))