(ns ogbe.fulcro.mui.icons.gesture
  #?(:cljs (:require
            ["@mui/icons-material/Gesture" :default Gesture]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gesture
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Gesture)))