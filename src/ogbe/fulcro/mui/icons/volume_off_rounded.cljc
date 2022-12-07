(ns ogbe.fulcro.mui.icons.volume-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VolumeOffRounded" :default VolumeOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeOffRounded)))