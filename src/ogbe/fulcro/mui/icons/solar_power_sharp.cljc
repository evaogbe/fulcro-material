(ns ogbe.fulcro.mui.icons.solar-power-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SolarPowerSharp" :default SolarPowerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-solar-power-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SolarPowerSharp)))