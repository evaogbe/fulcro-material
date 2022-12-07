(ns ogbe.fulcro.mui.icons.usb-sharp
  #?(:cljs (:require
            ["@mui/icons-material/UsbSharp" :default UsbSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-usb-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UsbSharp)))