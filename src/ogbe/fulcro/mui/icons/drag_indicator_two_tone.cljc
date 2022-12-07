(ns ogbe.fulcro.mui.icons.drag-indicator-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DragIndicatorTwoTone" :default DragIndicatorTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-indicator-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragIndicatorTwoTone)))