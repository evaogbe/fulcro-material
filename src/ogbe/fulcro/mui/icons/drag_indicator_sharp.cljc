(ns ogbe.fulcro.mui.icons.drag-indicator-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DragIndicatorSharp" :default DragIndicatorSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-indicator-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragIndicatorSharp)))