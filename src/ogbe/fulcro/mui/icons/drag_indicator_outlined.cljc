(ns ogbe.fulcro.mui.icons.drag-indicator-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DragIndicatorOutlined" :default DragIndicatorOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-indicator-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragIndicatorOutlined)))