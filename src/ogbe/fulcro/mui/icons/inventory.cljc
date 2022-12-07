(ns ogbe.fulcro.mui.icons.inventory
  #?(:cljs (:require
            ["@mui/icons-material/Inventory" :default Inventory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inventory
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Inventory)))