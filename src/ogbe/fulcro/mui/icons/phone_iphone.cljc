(ns ogbe.fulcro.mui.icons.phone-iphone
  #?(:cljs (:require
            ["@mui/icons-material/PhoneIphone" :default PhoneIphone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-iphone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneIphone)))