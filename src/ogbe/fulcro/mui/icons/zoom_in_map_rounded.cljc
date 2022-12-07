(ns ogbe.fulcro.mui.icons.zoom-in-map-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInMapRounded" :default ZoomInMapRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-map-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInMapRounded)))