(ns ogbe.fulcro.mui.icons.brush
  #?(:cljs (:require
            ["@mui/icons-material/Brush" :default Brush]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-brush
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Brush)))