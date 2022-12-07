(ns ogbe.fulcro.mui.icons.wifi-password
  #?(:cljs (:require
            ["@mui/icons-material/WifiPassword" :default WifiPassword]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-password
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiPassword)))