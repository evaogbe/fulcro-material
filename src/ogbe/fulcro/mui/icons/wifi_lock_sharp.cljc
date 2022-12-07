(ns ogbe.fulcro.mui.icons.wifi-lock-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WifiLockSharp" :default WifiLockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-lock-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiLockSharp)))