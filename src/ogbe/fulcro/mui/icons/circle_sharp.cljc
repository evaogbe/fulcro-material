(ns ogbe.fulcro.mui.icons.circle-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CircleSharp" :default CircleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-circle-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CircleSharp)))