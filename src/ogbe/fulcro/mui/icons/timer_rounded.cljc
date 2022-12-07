(ns ogbe.fulcro.mui.icons.timer-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TimerRounded" :default TimerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimerRounded)))