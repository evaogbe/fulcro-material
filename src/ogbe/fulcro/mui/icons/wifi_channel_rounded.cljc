(ns ogbe.fulcro.mui.icons.wifi-channel-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WifiChannelRounded" :default WifiChannelRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-channel-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiChannelRounded)))