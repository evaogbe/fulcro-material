(ns ogbe.fulcro.mui.icons.timer-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TimerSharp" :default TimerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimerSharp)))