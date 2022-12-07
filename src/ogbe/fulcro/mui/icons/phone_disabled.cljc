(ns ogbe.fulcro.mui.icons.phone-disabled
  #?(:cljs (:require
            ["@mui/icons-material/PhoneDisabled" :default PhoneDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneDisabled)))