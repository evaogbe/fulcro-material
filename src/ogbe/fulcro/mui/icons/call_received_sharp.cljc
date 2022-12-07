(ns ogbe.fulcro.mui.icons.call-received-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CallReceivedSharp" :default CallReceivedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-received-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallReceivedSharp)))