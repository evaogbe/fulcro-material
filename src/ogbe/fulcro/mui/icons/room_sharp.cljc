(ns ogbe.fulcro.mui.icons.room-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RoomSharp" :default RoomSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-room-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoomSharp)))