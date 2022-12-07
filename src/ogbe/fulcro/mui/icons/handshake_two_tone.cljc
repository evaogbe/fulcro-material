(ns ogbe.fulcro.mui.icons.handshake-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/HandshakeTwoTone" :default HandshakeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-handshake-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HandshakeTwoTone)))