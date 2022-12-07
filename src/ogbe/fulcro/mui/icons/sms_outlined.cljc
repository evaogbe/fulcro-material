(ns ogbe.fulcro.mui.icons.sms-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SmsOutlined" :default SmsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sms-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmsOutlined)))