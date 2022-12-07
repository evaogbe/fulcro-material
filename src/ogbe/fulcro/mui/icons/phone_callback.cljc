(ns ogbe.fulcro.mui.icons.phone-callback
  #?(:cljs (:require
            ["@mui/icons-material/PhoneCallback" :default PhoneCallback]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-callback
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneCallback)))