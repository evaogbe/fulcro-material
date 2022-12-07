(ns ogbe.fulcro.mui.icons.wifi-lock-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WifiLockTwoTone" :default WifiLockTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-lock-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiLockTwoTone)))