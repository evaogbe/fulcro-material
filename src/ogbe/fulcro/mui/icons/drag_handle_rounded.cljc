(ns ogbe.fulcro.mui.icons.drag-handle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DragHandleRounded" :default DragHandleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-handle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragHandleRounded)))