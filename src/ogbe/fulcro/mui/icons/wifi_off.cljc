(ns ogbe.fulcro.mui.icons.wifi-off
  #?(:cljs (:require
            ["@mui/icons-material/WifiOff" :default WifiOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiOff)))