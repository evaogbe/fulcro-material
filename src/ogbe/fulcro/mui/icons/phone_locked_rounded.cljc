(ns ogbe.fulcro.mui.icons.phone-locked-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhoneLockedRounded" :default PhoneLockedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-locked-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneLockedRounded)))