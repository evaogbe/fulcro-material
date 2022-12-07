(ns ogbe.fulcro.mui.icons.wifi-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WifiSharp" :default WifiSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiSharp)))