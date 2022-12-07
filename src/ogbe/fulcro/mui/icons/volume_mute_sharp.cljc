(ns ogbe.fulcro.mui.icons.volume-mute-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VolumeMuteSharp" :default VolumeMuteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-mute-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeMuteSharp)))