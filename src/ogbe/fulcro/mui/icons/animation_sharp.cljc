(ns ogbe.fulcro.mui.icons.animation-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AnimationSharp" :default AnimationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-animation-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnimationSharp)))