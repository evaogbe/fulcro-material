(ns ogbe.fulcro.mui.icons.spatial-tracking
  #?(:cljs (:require
            ["@mui/icons-material/SpatialTracking" :default SpatialTracking]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spatial-tracking
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpatialTracking)))