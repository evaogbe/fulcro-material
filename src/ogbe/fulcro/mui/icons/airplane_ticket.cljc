(ns ogbe.fulcro.mui.icons.airplane-ticket
  #?(:cljs (:require
            ["@mui/icons-material/AirplaneTicket" :default AirplaneTicket]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplane-ticket
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirplaneTicket)))