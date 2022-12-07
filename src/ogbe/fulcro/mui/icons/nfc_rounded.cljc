(ns ogbe.fulcro.mui.icons.nfc-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NfcRounded" :default NfcRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nfc-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NfcRounded)))