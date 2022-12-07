(ns ogbe.fulcro.mui.icons.webhook-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WebhookRounded" :default WebhookRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-webhook-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebhookRounded)))