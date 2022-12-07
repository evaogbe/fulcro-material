(ns ogbe.fulcro.mui.icons.nfc-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NfcOutlined" :default NfcOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nfc-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NfcOutlined)))