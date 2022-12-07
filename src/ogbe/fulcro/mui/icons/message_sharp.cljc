(ns ogbe.fulcro.mui.icons.message-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MessageSharp" :default MessageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-message-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MessageSharp)))