(ns ogbe.fulcro.mui.icons.wifi-password-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WifiPasswordRounded" :default WifiPasswordRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-password-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiPasswordRounded)))