(ns ogbe.fulcro.mui.icons.signal-wifi-bad
  #?(:cljs (:require
            ["@mui/icons-material/SignalWifiBad" :default SignalWifiBad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signal-wifi-bad
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignalWifiBad)))