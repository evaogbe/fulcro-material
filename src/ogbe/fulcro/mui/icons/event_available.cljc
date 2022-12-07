(ns ogbe.fulcro.mui.icons.event-available
  #?(:cljs (:require
            ["@mui/icons-material/EventAvailable" :default EventAvailable]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-available
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventAvailable)))