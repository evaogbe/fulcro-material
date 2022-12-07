(ns ogbe.fulcro.mui.icons.event
  #?(:cljs (:require
            ["@mui/icons-material/Event" :default Event]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Event)))