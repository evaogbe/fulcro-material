(ns ogbe.fulcro.mui.icons.nfc-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NfcSharp" :default NfcSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nfc-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NfcSharp)))