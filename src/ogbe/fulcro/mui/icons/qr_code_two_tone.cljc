(ns ogbe.fulcro.mui.icons.qr-code-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeTwoTone" :default QrCodeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeTwoTone)))