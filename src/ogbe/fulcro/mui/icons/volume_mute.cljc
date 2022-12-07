(ns ogbe.fulcro.mui.icons.volume-mute
  #?(:cljs (:require
            ["@mui/icons-material/VolumeMute" :default VolumeMute]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-mute
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeMute)))