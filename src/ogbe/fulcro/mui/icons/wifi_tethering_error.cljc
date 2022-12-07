(ns ogbe.fulcro.mui.icons.wifi-tethering-error
  #?(:cljs (:require
            ["@mui/icons-material/WifiTetheringError" :default WifiTetheringError]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wifi-tethering-error
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WifiTetheringError)))