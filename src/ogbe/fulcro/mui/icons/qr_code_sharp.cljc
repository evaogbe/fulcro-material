(ns ogbe.fulcro.mui.icons.qr-code-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeSharp" :default QrCodeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeSharp)))