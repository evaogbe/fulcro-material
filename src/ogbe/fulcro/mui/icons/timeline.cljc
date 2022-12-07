(ns ogbe.fulcro.mui.icons.timeline
  #?(:cljs (:require
            ["@mui/icons-material/Timeline" :default Timeline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timeline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Timeline)))