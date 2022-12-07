(ns ogbe.fulcro.mui.icons.zoom-in-map
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInMap" :default ZoomInMap]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-map
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInMap)))