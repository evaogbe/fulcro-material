(ns ogbe.fulcro.mui.icons.usb-outlined
  #?(:cljs (:require
            ["@mui/icons-material/UsbOutlined" :default UsbOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-usb-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UsbOutlined)))