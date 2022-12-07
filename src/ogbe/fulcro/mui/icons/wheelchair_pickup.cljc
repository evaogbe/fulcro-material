(ns ogbe.fulcro.mui.icons.wheelchair-pickup
  #?(:cljs (:require
            ["@mui/icons-material/WheelchairPickup" :default WheelchairPickup]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wheelchair-pickup
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WheelchairPickup)))