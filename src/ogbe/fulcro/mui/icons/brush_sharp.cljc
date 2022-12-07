(ns ogbe.fulcro.mui.icons.brush-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BrushSharp" :default BrushSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brush-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrushSharp)))