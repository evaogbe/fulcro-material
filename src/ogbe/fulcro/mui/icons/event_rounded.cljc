(ns ogbe.fulcro.mui.icons.event-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EventRounded" :default EventRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventRounded)))