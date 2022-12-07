(ns ogbe.fulcro.mui.icons.phone-missed
  #?(:cljs (:require
            ["@mui/icons-material/PhoneMissed" :default PhoneMissed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-missed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneMissed)))