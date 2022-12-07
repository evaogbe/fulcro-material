(ns ogbe.fulcro.mui.icons.wifi-password-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WifiPasswordSharp" :default WifiPasswordSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-password-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiPasswordSharp)))