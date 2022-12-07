(ns ogbe.fulcro.mui.icons.wifi-calling-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WifiCallingSharp" :default WifiCallingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-calling-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiCallingSharp)))