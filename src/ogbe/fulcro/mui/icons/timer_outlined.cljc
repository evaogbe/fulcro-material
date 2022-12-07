(ns ogbe.fulcro.mui.icons.timer-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TimerOutlined" :default TimerOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimerOutlined)))