(ns ogbe.fulcro.mui.icons.headset-mic
  #?(:cljs (:require
            ["@mui/icons-material/HeadsetMic" :default HeadsetMic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-headset-mic
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeadsetMic)))