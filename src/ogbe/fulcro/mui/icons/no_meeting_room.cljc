(ns ogbe.fulcro.mui.icons.no-meeting-room
  #?(:cljs (:require
            ["@mui/icons-material/NoMeetingRoom" :default NoMeetingRoom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-meeting-room
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoMeetingRoom)))