(ns ogbe.fulcro.mui.icons.volume-down-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VolumeDownRounded" :default VolumeDownRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-down-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeDownRounded)))