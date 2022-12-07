(ns ogbe.fulcro.mui.icons.wifi-calling
  #?(:cljs (:require
            ["@mui/icons-material/WifiCalling" :default WifiCalling]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-calling
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiCalling)))