(ns ogbe.fulcro.mui.icons.room-preferences
  #?(:cljs (:require
            ["@mui/icons-material/RoomPreferences" :default RoomPreferences]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-room-preferences
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoomPreferences)))