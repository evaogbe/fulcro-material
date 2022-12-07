(ns ogbe.fulcro.mui.icons.event-seat
  #?(:cljs (:require
            ["@mui/icons-material/EventSeat" :default EventSeat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-seat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventSeat)))