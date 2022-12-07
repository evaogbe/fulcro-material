(ns ogbe.fulcro.mui.icons.drag-indicator-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DragIndicatorRounded" :default DragIndicatorRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-indicator-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragIndicatorRounded)))