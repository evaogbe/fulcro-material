(ns ogbe.fulcro.mui.icons.room-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RoomRounded" :default RoomRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-room-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoomRounded)))