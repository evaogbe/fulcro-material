(ns ogbe.fulcro.mui.icons.zoom-out-map
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOutMap" :default ZoomOutMap]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out-map
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOutMap)))