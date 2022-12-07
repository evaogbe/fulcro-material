(ns ogbe.fulcro.mui.icons.water-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WaterRounded" :default WaterRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-water-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WaterRounded)))