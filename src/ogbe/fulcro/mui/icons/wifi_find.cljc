(ns ogbe.fulcro.mui.icons.wifi-find
  #?(:cljs (:require
            ["@mui/icons-material/WifiFind" :default WifiFind]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-find
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiFind)))