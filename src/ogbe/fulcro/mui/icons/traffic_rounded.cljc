(ns ogbe.fulcro.mui.icons.traffic-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TrafficRounded" :default TrafficRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-traffic-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrafficRounded)))