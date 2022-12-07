(ns ogbe.fulcro.mui.icons.solar-power
  #?(:cljs (:require
            ["@mui/icons-material/SolarPower" :default SolarPower]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-solar-power
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SolarPower)))