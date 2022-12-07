(ns ogbe.fulcro.mui.icons.brush-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BrushOutlined" :default BrushOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brush-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrushOutlined)))