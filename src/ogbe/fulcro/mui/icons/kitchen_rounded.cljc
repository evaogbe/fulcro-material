(ns ogbe.fulcro.mui.icons.kitchen-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KitchenRounded" :default KitchenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-kitchen-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KitchenRounded)))