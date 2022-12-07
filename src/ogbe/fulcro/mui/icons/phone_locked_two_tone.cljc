(ns ogbe.fulcro.mui.icons.phone-locked-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PhoneLockedTwoTone" :default PhoneLockedTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-locked-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneLockedTwoTone)))