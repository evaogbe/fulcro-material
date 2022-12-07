(ns ogbe.fulcro.mui.icons.call-received-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CallReceivedTwoTone" :default CallReceivedTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-received-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallReceivedTwoTone)))