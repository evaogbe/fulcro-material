(ns ogbe.fulcro.mui.icons.phone-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhoneSharp" :default PhoneSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneSharp)))