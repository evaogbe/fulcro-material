(ns ogbe.fulcro.mui.icons.water-damage
  #?(:cljs (:require
            ["@mui/icons-material/WaterDamage" :default WaterDamage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-water-damage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WaterDamage)))