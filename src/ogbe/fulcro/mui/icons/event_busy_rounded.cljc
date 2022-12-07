(ns ogbe.fulcro.mui.icons.event-busy-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EventBusyRounded" :default EventBusyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-busy-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventBusyRounded)))