(ns ogbe.fulcro.mui.icons.emoji-food-beverage
  #?(:cljs (:require
            ["@mui/icons-material/EmojiFoodBeverage" :default EmojiFoodBeverage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-emoji-food-beverage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EmojiFoodBeverage)))