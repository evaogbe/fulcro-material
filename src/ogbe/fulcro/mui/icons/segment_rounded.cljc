(ns ogbe.fulcro.mui.icons.segment-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SegmentRounded" :default SegmentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-segment-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SegmentRounded)))