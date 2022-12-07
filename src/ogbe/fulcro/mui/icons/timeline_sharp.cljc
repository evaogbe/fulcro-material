(ns ogbe.fulcro.mui.icons.timeline-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TimelineSharp" :default TimelineSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timeline-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimelineSharp)))