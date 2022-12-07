(ns ogbe.fulcro.mui.icons.volume-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VolumeOffSharp" :default VolumeOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeOffSharp)))