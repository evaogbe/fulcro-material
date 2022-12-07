(ns ogbe.fulcro.mui.icons.brush-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BrushRounded" :default BrushRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brush-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrushRounded)))