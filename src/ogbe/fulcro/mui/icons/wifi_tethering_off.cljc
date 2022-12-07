(ns ogbe.fulcro.mui.icons.wifi-tethering-off
  #?(:cljs (:require
            ["@mui/icons-material/WifiTetheringOff" :default WifiTetheringOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-tethering-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiTetheringOff)))