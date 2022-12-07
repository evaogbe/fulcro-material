(ns ogbe.fulcro.mui.icons.handshake
  #?(:cljs (:require
            ["@mui/icons-material/Handshake" :default Handshake]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-handshake
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Handshake)))