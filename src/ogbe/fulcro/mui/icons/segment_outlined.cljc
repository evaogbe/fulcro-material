(ns ogbe.fulcro.mui.icons.segment-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SegmentOutlined" :default SegmentOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-segment-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SegmentOutlined)))