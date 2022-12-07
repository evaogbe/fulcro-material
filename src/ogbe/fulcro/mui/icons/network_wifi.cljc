(ns ogbe.fulcro.mui.icons.network-wifi
  #?(:cljs (:require
            ["@mui/icons-material/NetworkWifi" :default NetworkWifi]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-network-wifi
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NetworkWifi)))