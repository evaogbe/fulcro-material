(ns ogbe.fulcro.mui.icons.departure-board
  #?(:cljs (:require
            ["@mui/icons-material/DepartureBoard" :default DepartureBoard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-departure-board
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DepartureBoard)))