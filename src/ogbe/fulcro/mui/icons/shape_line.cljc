(ns ogbe.fulcro.mui.icons.shape-line
  #?(:cljs (:require
            ["@mui/icons-material/ShapeLine" :default ShapeLine]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shape-line
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShapeLine)))