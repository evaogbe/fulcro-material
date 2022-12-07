(ns ogbe.fulcro.mui.icons.webhook-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WebhookOutlined" :default WebhookOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-webhook-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebhookOutlined)))