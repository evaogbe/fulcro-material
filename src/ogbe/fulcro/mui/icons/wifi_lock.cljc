(ns ogbe.fulcro.mui.icons.wifi-lock
  #?(:cljs (:require
            ["@mui/icons-material/WifiLock" :default WifiLock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-lock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiLock)))