(ns ogbe.fulcro.mui.icons.wifi-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WifiOffSharp" :default WifiOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiOffSharp)))