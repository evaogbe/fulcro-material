(ns ogbe.fulcro.mui.icons.qr-code-outlined
  #?(:cljs (:require
            ["@mui/icons-material/QrCodeOutlined" :default QrCodeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-qr-code-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QrCodeOutlined)))