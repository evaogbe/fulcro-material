(ns ogbe.fulcro.mui.icons.event-note
  #?(:cljs (:require
            ["@mui/icons-material/EventNote" :default EventNote]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-note
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventNote)))