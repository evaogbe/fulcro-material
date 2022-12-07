(ns ogbe.fulcro.mui.icons.room-service
  #?(:cljs (:require
            ["@mui/icons-material/RoomService" :default RoomService]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-room-service
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoomService)))