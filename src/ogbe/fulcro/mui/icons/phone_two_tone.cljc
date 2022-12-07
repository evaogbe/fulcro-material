(ns ogbe.fulcro.mui.icons.phone-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PhoneTwoTone" :default PhoneTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneTwoTone)))