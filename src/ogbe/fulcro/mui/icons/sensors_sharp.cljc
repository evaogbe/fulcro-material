(ns ogbe.fulcro.mui.icons.sensors-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SensorsSharp" :default SensorsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensors-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorsSharp)))