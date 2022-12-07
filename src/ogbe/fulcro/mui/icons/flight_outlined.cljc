(ns ogbe.fulcro.mui.icons.flight-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FlightOutlined" :default FlightOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flight-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlightOutlined)))