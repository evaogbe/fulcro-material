(ns ogbe.fulcro.mui.icons.segment
  #?(:cljs (:require
            ["@mui/icons-material/Segment" :default Segment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-segment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Segment)))