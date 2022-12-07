(ns ogbe.fulcro.mui.icons.usb
  #?(:cljs (:require
            ["@mui/icons-material/Usb" :default Usb]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-usb
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Usb)))