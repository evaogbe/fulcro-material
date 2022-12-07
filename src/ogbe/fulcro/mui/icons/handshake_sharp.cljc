(ns ogbe.fulcro.mui.icons.handshake-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HandshakeSharp" :default HandshakeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-handshake-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HandshakeSharp)))