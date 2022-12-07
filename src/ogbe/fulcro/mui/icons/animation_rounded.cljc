(ns ogbe.fulcro.mui.icons.animation-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AnimationRounded" :default AnimationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-animation-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnimationRounded)))