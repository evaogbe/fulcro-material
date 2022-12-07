(ns ogbe.fulcro.mui.icons.animation-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AnimationTwoTone" :default AnimationTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-animation-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnimationTwoTone)))