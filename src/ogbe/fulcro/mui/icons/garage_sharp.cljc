(ns ogbe.fulcro.mui.icons.garage-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GarageSharp" :default GarageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-garage-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GarageSharp)))