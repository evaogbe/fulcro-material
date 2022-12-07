(ns ogbe.fulcro.mui.icons.phone-enabled-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PhoneEnabledTwoTone" :default PhoneEnabledTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-enabled-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneEnabledTwoTone)))