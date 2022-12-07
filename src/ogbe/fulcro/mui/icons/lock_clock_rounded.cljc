(ns ogbe.fulcro.mui.icons.lock-clock-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LockClockRounded" :default LockClockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-clock-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockClockRounded)))