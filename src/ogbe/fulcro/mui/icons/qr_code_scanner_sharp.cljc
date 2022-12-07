(ns ogbe.fulcro.mui.icons.qr-code-scanner-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeScannerSharp" :default QrCodeScannerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-scanner-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeScannerSharp)))