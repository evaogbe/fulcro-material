(ns ogbe.fulcro.mui.icons.traffic-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TrafficOutlined" :default TrafficOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-traffic-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrafficOutlined)))