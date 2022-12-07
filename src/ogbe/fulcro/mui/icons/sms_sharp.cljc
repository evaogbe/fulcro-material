(ns ogbe.fulcro.mui.icons.sms-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SmsSharp" :default SmsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sms-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmsSharp)))