(ns ogbe.fulcro.mui.icons.gesture-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GestureSharp" :default GestureSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gesture-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GestureSharp)))