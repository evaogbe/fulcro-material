(ns ogbe.fulcro.mui.icons.meeting-room
  #?(:cljs (:require
            ["@mui/icons-material/MeetingRoom" :default MeetingRoom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-meeting-room
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MeetingRoom)))