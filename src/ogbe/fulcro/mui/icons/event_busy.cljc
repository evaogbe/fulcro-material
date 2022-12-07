(ns ogbe.fulcro.mui.icons.event-busy
  #?(:cljs (:require
            ["@mui/icons-material/EventBusy" :default EventBusy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-busy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventBusy)))