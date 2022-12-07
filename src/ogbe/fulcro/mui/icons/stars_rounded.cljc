(ns ogbe.fulcro.mui.icons.stars-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StarsRounded" :default StarsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stars-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarsRounded)))