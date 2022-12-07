(ns ogbe.fulcro.mui.icons.wifi-channel
  #?(:cljs (:require
            ["@mui/icons-material/WifiChannel" :default WifiChannel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-channel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiChannel)))