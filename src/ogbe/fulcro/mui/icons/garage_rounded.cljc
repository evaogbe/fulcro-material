(ns ogbe.fulcro.mui.icons.garage-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GarageRounded" :default GarageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-garage-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GarageRounded)))