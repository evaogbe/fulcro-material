(ns ogbe.fulcro.mui.icons.inventory-rounded
  #?(:cljs (:require
            ["@mui/icons-material/InventoryRounded" :default InventoryRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inventory-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InventoryRounded)))