(ns ogbe.fulcro.mui.icons.sip-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SipOutlined" :default SipOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sip-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SipOutlined)))