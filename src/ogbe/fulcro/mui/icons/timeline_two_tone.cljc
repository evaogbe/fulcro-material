(ns ogbe.fulcro.mui.icons.timeline-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TimelineTwoTone" :default TimelineTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timeline-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TimelineTwoTone)))