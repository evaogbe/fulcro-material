(ns ogbe.fulcro.mui.icons.volume-off
  #?(:cljs (:require
            ["@mui/icons-material/VolumeOff" :default VolumeOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeOff)))