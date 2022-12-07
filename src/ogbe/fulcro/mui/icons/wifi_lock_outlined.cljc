(ns ogbe.fulcro.mui.icons.wifi-lock-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WifiLockOutlined" :default WifiLockOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-lock-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiLockOutlined)))