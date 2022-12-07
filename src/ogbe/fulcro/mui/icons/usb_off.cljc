(ns ogbe.fulcro.mui.icons.usb-off
  #?(:cljs (:require
            ["@mui/icons-material/UsbOff" :default UsbOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-usb-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UsbOff)))