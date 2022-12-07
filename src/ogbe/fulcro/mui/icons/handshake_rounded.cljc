(ns ogbe.fulcro.mui.icons.handshake-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HandshakeRounded" :default HandshakeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-handshake-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HandshakeRounded)))