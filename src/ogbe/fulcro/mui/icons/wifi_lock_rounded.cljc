(ns ogbe.fulcro.mui.icons.wifi-lock-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WifiLockRounded" :default WifiLockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-lock-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiLockRounded)))