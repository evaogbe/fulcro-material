(ns ogbe.fulcro.mui.icons.wifi2-bar
  #?(:cljs (:require
            ["@mui/icons-material/Wifi2Bar" :default Wifi2Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi2-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wifi2Bar)))