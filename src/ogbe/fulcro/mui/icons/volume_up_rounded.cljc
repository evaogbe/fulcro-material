(ns ogbe.fulcro.mui.icons.volume-up-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VolumeUpRounded" :default VolumeUpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-up-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeUpRounded)))