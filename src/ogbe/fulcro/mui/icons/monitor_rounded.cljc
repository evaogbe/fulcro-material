(ns ogbe.fulcro.mui.icons.monitor-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MonitorRounded" :default MonitorRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonitorRounded)))