(ns ogbe.fulcro.mui.icons.sell-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SellRounded" :default SellRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sell-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SellRounded)))