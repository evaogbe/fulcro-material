(ns ogbe.fulcro.mui.icons.event-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EventSharp" :default EventSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventSharp)))