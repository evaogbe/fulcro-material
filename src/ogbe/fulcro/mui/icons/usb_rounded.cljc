(ns ogbe.fulcro.mui.icons.usb-rounded
  #?(:cljs (:require
            ["@mui/icons-material/UsbRounded" :default UsbRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-usb-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UsbRounded)))