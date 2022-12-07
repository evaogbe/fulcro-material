(ns ogbe.fulcro.mui.icons.wifi-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WifiRounded" :default WifiRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiRounded)))