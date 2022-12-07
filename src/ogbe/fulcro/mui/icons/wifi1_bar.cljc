(ns ogbe.fulcro.mui.icons.wifi1-bar
  #?(:cljs (:require
            ["@mui/icons-material/Wifi1Bar" :default Wifi1Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi1-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wifi1Bar)))