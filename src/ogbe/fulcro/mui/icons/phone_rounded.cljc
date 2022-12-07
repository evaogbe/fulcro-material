(ns ogbe.fulcro.mui.icons.phone-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhoneRounded" :default PhoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneRounded)))