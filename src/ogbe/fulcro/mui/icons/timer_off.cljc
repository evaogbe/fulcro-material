(ns ogbe.fulcro.mui.icons.timer-off
  #?(:cljs (:require
            ["@mui/icons-material/TimerOff" :default TimerOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimerOff)))