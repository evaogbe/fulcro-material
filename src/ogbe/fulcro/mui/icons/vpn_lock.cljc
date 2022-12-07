(ns ogbe.fulcro.mui.icons.vpn-lock
  #?(:cljs (:require
            ["@mui/icons-material/VpnLock" :default VpnLock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vpn-lock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VpnLock)))