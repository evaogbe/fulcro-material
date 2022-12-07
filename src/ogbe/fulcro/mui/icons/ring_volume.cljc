(ns ogbe.fulcro.mui.icons.ring-volume
  #?(:cljs (:require
            ["@mui/icons-material/RingVolume" :default RingVolume]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ring-volume
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RingVolume)))