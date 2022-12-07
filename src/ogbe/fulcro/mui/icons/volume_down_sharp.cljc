(ns ogbe.fulcro.mui.icons.volume-down-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VolumeDownSharp" :default VolumeDownSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-down-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeDownSharp)))