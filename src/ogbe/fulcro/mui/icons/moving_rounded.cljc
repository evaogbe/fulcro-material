(ns ogbe.fulcro.mui.icons.moving-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MovingRounded" :default MovingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-moving-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovingRounded)))