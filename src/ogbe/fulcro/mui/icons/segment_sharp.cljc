(ns ogbe.fulcro.mui.icons.segment-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SegmentSharp" :default SegmentSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-segment-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SegmentSharp)))