(ns ogbe.fulcro.mui.icons.event-busy-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EventBusySharp" :default EventBusySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-busy-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventBusySharp)))