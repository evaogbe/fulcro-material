(ns ogbe.fulcro.mui.icons.call-received-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CallReceivedRounded" :default CallReceivedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-received-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallReceivedRounded)))