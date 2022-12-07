(ns ogbe.fulcro.mui.icons.phone-enabled
  #?(:cljs (:require
            ["@mui/icons-material/PhoneEnabled" :default PhoneEnabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-enabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneEnabled)))