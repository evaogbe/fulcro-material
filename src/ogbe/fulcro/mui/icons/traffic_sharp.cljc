(ns ogbe.fulcro.mui.icons.traffic-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TrafficSharp" :default TrafficSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-traffic-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrafficSharp)))