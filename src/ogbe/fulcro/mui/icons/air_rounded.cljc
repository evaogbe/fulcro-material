(ns ogbe.fulcro.mui.icons.air-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AirRounded" :default AirRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-air-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirRounded)))