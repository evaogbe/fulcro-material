(ns ogbe.fulcro.mui.icons.lock-clock
  #?(:cljs (:require
            ["@mui/icons-material/LockClock" :default LockClock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-clock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockClock)))