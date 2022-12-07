(ns ogbe.fulcro.mui.icons.timeline-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TimelineRounded" :default TimelineRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timeline-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimelineRounded)))