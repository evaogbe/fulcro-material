(ns ogbe.fulcro.mui.icons.phonelink-lock
  #?(:cljs (:require
            ["@mui/icons-material/PhonelinkLock" :default PhonelinkLock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phonelink-lock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhonelinkLock)))