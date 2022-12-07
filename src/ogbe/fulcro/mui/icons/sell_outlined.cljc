(ns ogbe.fulcro.mui.icons.sell-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SellOutlined" :default SellOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sell-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SellOutlined)))