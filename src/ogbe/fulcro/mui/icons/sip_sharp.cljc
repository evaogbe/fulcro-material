(ns ogbe.fulcro.mui.icons.sip-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SipSharp" :default SipSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sip-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SipSharp)))