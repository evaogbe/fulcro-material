(ns ogbe.fulcro.mui.icons.coffee-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CoffeeSharp" :default CoffeeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-coffee-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CoffeeSharp)))