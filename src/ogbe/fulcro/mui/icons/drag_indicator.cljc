(ns ogbe.fulcro.mui.icons.drag-indicator
  #?(:cljs (:require
            ["@mui/icons-material/DragIndicator" :default DragIndicator]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drag-indicator
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DragIndicator)))