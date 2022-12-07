(ns ogbe.fulcro.mui.icons.phone-locked
  #?(:cljs (:require
            ["@mui/icons-material/PhoneLocked" :default PhoneLocked]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-locked
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneLocked)))