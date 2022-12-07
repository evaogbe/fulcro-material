(ns ogbe.fulcro.mui.icons.qr-code-scanner-rounded
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeScannerRounded" :default QrCodeScannerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-scanner-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeScannerRounded)))