(ns ogbe.fulcro.mui.icons.inventory-sharp
  #?(:cljs (:require
            ["@mui/icons-material/InventorySharp" :default InventorySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inventory-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InventorySharp)))