(ns ogbe.fulcro.mui.icons.webhook
  #?(:cljs (:require
            ["@mui/icons-material/Webhook" :default Webhook]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-webhook
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Webhook)))