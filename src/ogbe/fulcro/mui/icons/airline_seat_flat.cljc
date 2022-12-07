(ns ogbe.fulcro.mui.icons.airline-seat-flat
  #?(:cljs (:require
            ["@mui/icons-material/AirlineSeatFlat" :default AirlineSeatFlat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airline-seat-flat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirlineSeatFlat)))