(ns ogbe.fulcro.mui.icons.webhook-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WebhookTwoTone" :default WebhookTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-webhook-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebhookTwoTone)))