(ns ogbe.fulcro.mui.icons.timer-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TimerTwoTone" :default TimerTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimerTwoTone)))