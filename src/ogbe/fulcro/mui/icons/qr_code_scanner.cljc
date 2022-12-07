(ns ogbe.fulcro.mui.icons.qr-code-scanner
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeScanner" :default QrCodeScanner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-scanner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeScanner)))