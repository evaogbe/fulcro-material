(ns ogbe.fulcro.mui.icons.coffee-maker
  #?(:cljs (:require
            ["@mui/icons-material/CoffeeMaker" :default CoffeeMaker]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-coffee-maker
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CoffeeMaker)))