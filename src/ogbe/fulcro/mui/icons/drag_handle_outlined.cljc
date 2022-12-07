(ns ogbe.fulcro.mui.icons.drag-handle-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DragHandleOutlined" :default DragHandleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-handle-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragHandleOutlined)))