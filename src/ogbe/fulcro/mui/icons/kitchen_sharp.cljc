(ns ogbe.fulcro.mui.icons.kitchen-sharp
  #?(:cljs (:require
            ["@mui/icons-material/KitchenSharp" :default KitchenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-kitchen-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KitchenSharp)))