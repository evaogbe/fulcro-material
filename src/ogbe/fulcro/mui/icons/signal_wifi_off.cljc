(ns ogbe.fulcro.mui.icons.signal-wifi-off
  #?(:cljs (:require
            ["@mui/icons-material/SignalWifiOff" :default SignalWifiOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signal-wifi-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignalWifiOff)))