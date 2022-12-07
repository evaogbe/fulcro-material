(ns ogbe.fulcro.mui.icons.monitor-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MonitorOutlined" :default MonitorOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonitorOutlined)))