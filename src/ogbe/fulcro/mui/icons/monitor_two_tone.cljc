(ns ogbe.fulcro.mui.icons.monitor-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MonitorTwoTone" :default MonitorTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonitorTwoTone)))