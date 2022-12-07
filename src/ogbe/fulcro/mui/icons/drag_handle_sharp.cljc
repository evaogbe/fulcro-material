(ns ogbe.fulcro.mui.icons.drag-handle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DragHandleSharp" :default DragHandleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-handle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragHandleSharp)))