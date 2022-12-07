(ns ogbe.fulcro.mui.icons.timeline-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TimelineOutlined" :default TimelineOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timeline-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimelineOutlined)))