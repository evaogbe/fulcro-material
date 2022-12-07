(ns ogbe.fulcro.mui.icons.zoom-out
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOut" :default ZoomOut]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOut)))