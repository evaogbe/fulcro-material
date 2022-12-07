(ns ogbe.fulcro.mui.icons.shape-line-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShapeLineSharp" :default ShapeLineSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shape-line-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShapeLineSharp)))