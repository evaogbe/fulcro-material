(ns ogbe.fulcro.mui.icons.event-busy-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EventBusyOutlined" :default EventBusyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-busy-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventBusyOutlined)))