(ns ogbe.fulcro.mui.icons.event-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EventOutlined" :default EventOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-event-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EventOutlined)))