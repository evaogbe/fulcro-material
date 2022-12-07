(ns ogbe.fulcro.mui.icons.smoking-rooms
  #?(:cljs (:require
            ["@mui/icons-material/SmokingRooms" :default SmokingRooms]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-smoking-rooms
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SmokingRooms)))