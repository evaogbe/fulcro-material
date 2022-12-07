(ns ogbe.fulcro.mui.icons.directions-car
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsCar" :default DirectionsCar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-car
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsCar)))