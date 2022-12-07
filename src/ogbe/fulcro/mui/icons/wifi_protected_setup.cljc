(ns ogbe.fulcro.mui.icons.wifi-protected-setup
  #?(:cljs (:require
            ["@mui/icons-material/WifiProtectedSetup" :default WifiProtectedSetup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-protected-setup
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiProtectedSetup)))