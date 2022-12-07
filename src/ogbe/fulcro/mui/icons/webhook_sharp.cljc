(ns ogbe.fulcro.mui.icons.webhook-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WebhookSharp" :default WebhookSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-webhook-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebhookSharp)))