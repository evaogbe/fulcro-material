(ns ogbe.fulcro.mui.icons.signal-wifi2-bar
  #?(:cljs (:require
            ["@mui/icons-material/SignalWifi2Bar" :default SignalWifi2Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signal-wifi2-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignalWifi2Bar)))