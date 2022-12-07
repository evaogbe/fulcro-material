(ns ogbe.fulcro.mui.icons.wifi-password-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WifiPasswordOutlined" :default WifiPasswordOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-password-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiPasswordOutlined)))