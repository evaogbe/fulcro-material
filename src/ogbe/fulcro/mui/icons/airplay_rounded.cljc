(ns ogbe.fulcro.mui.icons.airplay-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AirplayRounded" :default AirplayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplay-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirplayRounded)))