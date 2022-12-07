(ns ogbe.fulcro.mui.icons.monitor-weight
  #?(:cljs (:require
            ["@mui/icons-material/MonitorWeight" :default MonitorWeight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor-weight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonitorWeight)))