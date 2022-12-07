(ns ogbe.fulcro.mui.icons.gesture-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GestureRounded" :default GestureRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gesture-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GestureRounded)))