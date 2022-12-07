(ns ogbe.fulcro.mui.icons.phone-android
  #?(:cljs (:require
            ["@mui/icons-material/PhoneAndroid" :default PhoneAndroid]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-android
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneAndroid)))