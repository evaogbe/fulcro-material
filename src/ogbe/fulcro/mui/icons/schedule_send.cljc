(ns ogbe.fulcro.mui.icons.schedule-send
  #?(:cljs (:require
            ["@mui/icons-material/ScheduleSend" :default ScheduleSend]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schedule-send
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScheduleSend)))