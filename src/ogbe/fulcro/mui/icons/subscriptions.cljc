(ns ogbe.fulcro.mui.icons.subscriptions
  #?(:cljs (:require
            ["@mui/icons-material/Subscriptions" :default Subscriptions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subscriptions
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Subscriptions)))