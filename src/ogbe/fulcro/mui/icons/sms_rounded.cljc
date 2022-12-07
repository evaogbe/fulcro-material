(ns ogbe.fulcro.mui.icons.sms-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SmsRounded" :default SmsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sms-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmsRounded)))