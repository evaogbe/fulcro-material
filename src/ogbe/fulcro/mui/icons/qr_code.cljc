(ns ogbe.fulcro.mui.icons.qr-code
  #?(:cljs (:require
            ["@mui/icons-material/QrCode" :default QrCode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCode)))