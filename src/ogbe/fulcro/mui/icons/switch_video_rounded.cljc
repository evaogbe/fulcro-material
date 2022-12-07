(ns ogbe.fulcro.mui.icons.switch-video-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SwitchVideoRounded" :default SwitchVideoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-video-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchVideoRounded)))