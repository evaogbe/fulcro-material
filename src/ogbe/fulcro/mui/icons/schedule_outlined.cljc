(ns ogbe.fulcro.mui.icons.schedule-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ScheduleOutlined" :default ScheduleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schedule-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScheduleOutlined)))