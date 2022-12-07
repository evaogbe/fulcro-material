(ns ogbe.fulcro.mui.icons.drag-handle
  #?(:cljs (:require
            ["@mui/icons-material/DragHandle" :default DragHandle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-handle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragHandle)))