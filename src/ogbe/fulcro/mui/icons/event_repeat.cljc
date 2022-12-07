(ns ogbe.fulcro.mui.icons.event-repeat
  #?(:cljs (:require
            ["@mui/icons-material/EventRepeat" :default EventRepeat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-repeat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventRepeat)))