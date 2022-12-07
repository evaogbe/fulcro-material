(ns ogbe.fulcro.mui.icons.room-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RoomOutlined" :default RoomOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-room-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoomOutlined)))