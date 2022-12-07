(ns ogbe.fulcro.mui.icons.wifi-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/WifiTwoTone" :default WifiTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiTwoTone)))