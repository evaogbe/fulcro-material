(ns ogbe.fulcro.mui.icons.call-received
  #?(:cljs (:require
            ["@mui/icons-material/CallReceived" :default CallReceived]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-received
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallReceived)))