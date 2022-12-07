(ns ogbe.fulcro.mui.icons.volume-up-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VolumeUpSharp" :default VolumeUpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-up-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeUpSharp)))