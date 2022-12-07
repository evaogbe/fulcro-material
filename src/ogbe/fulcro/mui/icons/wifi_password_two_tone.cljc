(ns ogbe.fulcro.mui.icons.wifi-password-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WifiPasswordTwoTone" :default WifiPasswordTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-password-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiPasswordTwoTone)))