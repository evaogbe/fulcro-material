(ns ogbe.fulcro.mui.icons.phone-paused
  #?(:cljs (:require
            ["@mui/icons-material/PhonePaused" :default PhonePaused]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-paused
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhonePaused)))