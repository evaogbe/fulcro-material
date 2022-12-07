(ns ogbe.fulcro.mui.icons.bike-scooter
  #?(:cljs (:require
            ["@mui/icons-material/BikeScooter" :default BikeScooter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bike-scooter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BikeScooter)))