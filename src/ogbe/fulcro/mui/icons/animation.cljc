(ns ogbe.fulcro.mui.icons.animation
  #?(:cljs (:require
            ["@mui/icons-material/Animation" :default Animation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-animation
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Animation)))