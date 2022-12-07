(ns ogbe.fulcro.mui.icons.wifi
  #?(:cljs (:require
            ["@mui/icons-material/Wifi" :default Wifi]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Wifi)))