(ns ogbe.fulcro.mui.icons.sell-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SellSharp" :default SellSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sell-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SellSharp)))