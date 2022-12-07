(ns ogbe.fulcro.mui.icons.schedule-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScheduleRounded" :default ScheduleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schedule-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScheduleRounded)))