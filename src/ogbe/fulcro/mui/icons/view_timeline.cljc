(ns ogbe.fulcro.mui.icons.view-timeline
  #?(:cljs (:require
            ["@mui/icons-material/ViewTimeline" :default ViewTimeline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-timeline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewTimeline)))