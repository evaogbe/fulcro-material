(ns ogbe.fulcro.mui.icons.volume-mute-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VolumeMuteRounded" :default VolumeMuteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-mute-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeMuteRounded)))