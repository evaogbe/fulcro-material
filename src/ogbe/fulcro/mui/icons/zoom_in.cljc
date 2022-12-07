(ns ogbe.fulcro.mui.icons.zoom-in
  #?(:cljs (:require
            ["@mui/icons-material/ZoomIn" :default ZoomIn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomIn)))