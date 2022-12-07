(ns ogbe.fulcro.mui.icons.headset-off
  #?(:cljs (:require
            ["@mui/icons-material/HeadsetOff" :default HeadsetOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-headset-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HeadsetOff)))