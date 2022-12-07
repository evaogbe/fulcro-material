(ns ogbe.fulcro.mui.icons.lock-clock-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LockClockSharp" :default LockClockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-clock-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockClockSharp)))