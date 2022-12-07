(ns ogbe.fulcro.mui.icons.vpn-key
  #?(:cljs (:require
            ["@mui/icons-material/VpnKey" :default VpnKey]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vpn-key
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VpnKey)))