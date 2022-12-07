(ns ogbe.fulcro.mui.icons.monitor-heart
  #?(:cljs (:require
            ["@mui/icons-material/MonitorHeart" :default MonitorHeart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-monitor-heart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MonitorHeart)))