(ns ogbe.fulcro.mui.icons.wifi-tethering
  #?(:cljs (:require
            ["@mui/icons-material/WifiTethering" :default WifiTethering]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-tethering
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiTethering)))