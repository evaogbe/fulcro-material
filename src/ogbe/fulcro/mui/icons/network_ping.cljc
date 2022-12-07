(ns ogbe.fulcro.mui.icons.network-ping
  #?(:cljs (:require
            ["@mui/icons-material/NetworkPing" :default NetworkPing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-network-ping
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NetworkPing)))