(ns ogbe.fulcro.mui.icons.phone-forwarded
  #?(:cljs (:require
            ["@mui/icons-material/PhoneForwarded" :default PhoneForwarded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-forwarded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneForwarded)))