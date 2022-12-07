(ns ogbe.fulcro.mui.icons.volume-down
  #?(:cljs (:require
            ["@mui/icons-material/VolumeDown" :default VolumeDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeDown)))