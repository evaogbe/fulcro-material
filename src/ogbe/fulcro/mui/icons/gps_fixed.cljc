(ns ogbe.fulcro.mui.icons.gps-fixed
  #?(:cljs (:require
            ["@mui/icons-material/GpsFixed" :default GpsFixed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gps-fixed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GpsFixed)))