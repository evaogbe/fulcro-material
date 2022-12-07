(ns ogbe.fulcro.mui.icons.inventory2
  #?(:cljs (:require
            ["@mui/icons-material/Inventory2" :default Inventory2]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-inventory2
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Inventory2)))