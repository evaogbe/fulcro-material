(ns ogbe.fulcro.mui.icons.qr-code2
  #?(:cljs (:require
            ["@mui/icons-material/QrCode2" :default QrCode2]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code2
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCode2)))