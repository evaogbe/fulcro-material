(ns ogbe.fulcro.mui.icons.pedal-bike
  #?(:cljs (:require
            ["@mui/icons-material/PedalBike" :default PedalBike]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pedal-bike
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PedalBike)))