(ns ogbe.fulcro.mui.icons.radar-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RadarRounded" :default RadarRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radar-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadarRounded)))