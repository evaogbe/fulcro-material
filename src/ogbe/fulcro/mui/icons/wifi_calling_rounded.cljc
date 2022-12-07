(ns ogbe.fulcro.mui.icons.wifi-calling-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WifiCallingRounded" :default WifiCallingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-calling-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiCallingRounded)))