(ns ogbe.fulcro.mui.icons.vibration-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VibrationSharp" :default VibrationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vibration-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VibrationSharp)))