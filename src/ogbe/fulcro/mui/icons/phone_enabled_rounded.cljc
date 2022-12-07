(ns ogbe.fulcro.mui.icons.phone-enabled-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhoneEnabledRounded" :default PhoneEnabledRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-enabled-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneEnabledRounded)))