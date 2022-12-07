(ns ogbe.fulcro.mui.icons.punch-clock
  #?(:cljs (:require
            ["@mui/icons-material/PunchClock" :default PunchClock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-punch-clock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PunchClock)))