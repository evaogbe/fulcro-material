(ns ogbe.fulcro.mui.icons.phonelink-setup
  #?(:cljs (:require
            ["@mui/icons-material/PhonelinkSetup" :default PhonelinkSetup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phonelink-setup
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhonelinkSetup)))