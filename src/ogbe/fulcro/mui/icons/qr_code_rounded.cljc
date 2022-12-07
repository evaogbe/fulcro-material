(ns ogbe.fulcro.mui.icons.qr-code-rounded
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeRounded" :default QrCodeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeRounded)))