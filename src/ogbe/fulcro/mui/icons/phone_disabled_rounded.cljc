(ns ogbe.fulcro.mui.icons.phone-disabled-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhoneDisabledRounded" :default PhoneDisabledRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-disabled-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneDisabledRounded)))