(ns ogbe.fulcro.mui.icons.dialer-sip
  #?(:cljs (:require
            ["@mui/icons-material/DialerSip" :default DialerSip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dialer-sip
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DialerSip)))