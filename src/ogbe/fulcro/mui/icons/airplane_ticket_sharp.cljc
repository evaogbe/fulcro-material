(ns ogbe.fulcro.mui.icons.airplane-ticket-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AirplaneTicketSharp" :default AirplaneTicketSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplane-ticket-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirplaneTicketSharp)))