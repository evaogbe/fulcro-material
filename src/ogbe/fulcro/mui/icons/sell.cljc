(ns ogbe.fulcro.mui.icons.sell
  #?(:cljs (:require
            ["@mui/icons-material/Sell" :default Sell]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sell
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Sell)))