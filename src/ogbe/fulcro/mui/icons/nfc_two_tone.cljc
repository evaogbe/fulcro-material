(ns ogbe.fulcro.mui.icons.nfc-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/NfcTwoTone" :default NfcTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nfc-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NfcTwoTone)))