(ns ogbe.fulcro.mui.icons.call-missed-outgoing
  #?(:cljs (:require
            ["@mui/icons-material/CallMissedOutgoing" :default CallMissedOutgoing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-missed-outgoing
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallMissedOutgoing)))