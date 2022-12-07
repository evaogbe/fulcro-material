(ns ogbe.fulcro.mui.icons.monitor-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MonitorSharp" :default MonitorSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonitorSharp)))