(ns ogbe.fulcro.mui.icons.moving-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MovingSharp" :default MovingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-moving-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MovingSharp)))