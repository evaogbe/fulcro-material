(ns ogbe.fulcro.mui.icons.sip-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SipRounded" :default SipRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sip-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SipRounded)))