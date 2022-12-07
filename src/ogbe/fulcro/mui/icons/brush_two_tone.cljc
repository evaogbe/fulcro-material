(ns ogbe.fulcro.mui.icons.brush-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BrushTwoTone" :default BrushTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brush-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrushTwoTone)))