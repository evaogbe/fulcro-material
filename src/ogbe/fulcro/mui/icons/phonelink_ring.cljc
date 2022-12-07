(ns ogbe.fulcro.mui.icons.phonelink-ring
  #?(:cljs (:require
            ["@mui/icons-material/PhonelinkRing" :default PhonelinkRing]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phonelink-ring
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhonelinkRing)))