(ns ogbe.fulcro.mui.icons.sports-basketball
  #?(:cljs (:require
            ["@mui/icons-material/SportsBasketball" :default SportsBasketball]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-basketball
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsBasketball)))