(ns ogbe.fulcro.mui.icons.wifi-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WifiOutlined" :default WifiOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiOutlined)))