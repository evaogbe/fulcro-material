(ns ogbe.fulcro.mui.icons.format-shapes
  #?(:cljs (:require
            ["@mui/icons-material/FormatShapes" :default FormatShapes]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-format-shapes
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FormatShapes)))