(ns ogbe.fulcro.mui.icons.compass-calibration
  #?(:cljs (:require
            ["@mui/icons-material/CompassCalibration" :default CompassCalibration]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-compass-calibration
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CompassCalibration)))