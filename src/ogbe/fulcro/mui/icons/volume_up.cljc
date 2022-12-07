(ns ogbe.fulcro.mui.icons.volume-up
  #?(:cljs (:require
            ["@mui/icons-material/VolumeUp" :default VolumeUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volume-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VolumeUp)))