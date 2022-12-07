(ns ogbe.fulcro.mui.icons.volume-mute-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VolumeMuteOutlined" :default VolumeMuteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-mute-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeMuteOutlined)))