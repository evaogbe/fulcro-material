(ns ogbe.fulcro.mui.icons.circle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CircleRounded" :default CircleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-circle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CircleRounded)))