(ns ogbe.fulcro.mui.icons.zoom-out-map-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOutMapRounded" :default ZoomOutMapRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out-map-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOutMapRounded)))