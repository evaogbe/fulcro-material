(ns ogbe.fulcro.mui.icons.subscriptions-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SubscriptionsRounded" :default SubscriptionsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subscriptions-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SubscriptionsRounded)))