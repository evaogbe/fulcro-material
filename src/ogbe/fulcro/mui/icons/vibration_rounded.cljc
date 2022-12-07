(ns ogbe.fulcro.mui.icons.vibration-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VibrationRounded" :default VibrationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vibration-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VibrationRounded)))