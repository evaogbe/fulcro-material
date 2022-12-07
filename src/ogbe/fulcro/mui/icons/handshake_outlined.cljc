(ns ogbe.fulcro.mui.icons.handshake-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HandshakeOutlined" :default HandshakeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-handshake-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HandshakeOutlined)))