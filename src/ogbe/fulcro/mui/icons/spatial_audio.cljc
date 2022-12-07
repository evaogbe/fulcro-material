(ns ogbe.fulcro.mui.icons.spatial-audio
  #?(:cljs (:require
            ["@mui/icons-material/SpatialAudio" :default SpatialAudio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spatial-audio
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpatialAudio)))