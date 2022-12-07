(ns ogbe.fulcro.mui.icons.usb-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/UsbTwoTone" :default UsbTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-usb-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UsbTwoTone)))