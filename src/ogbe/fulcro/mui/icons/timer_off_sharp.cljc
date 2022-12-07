(ns ogbe.fulcro.mui.icons.timer-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TimerOffSharp" :default TimerOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimerOffSharp)))