(ns ogbe.fulcro.mui.icons.sip-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SipTwoTone" :default SipTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sip-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SipTwoTone)))