(ns ogbe.fulcro.mui.icons.call-received-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CallReceivedOutlined" :default CallReceivedOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-received-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallReceivedOutlined)))