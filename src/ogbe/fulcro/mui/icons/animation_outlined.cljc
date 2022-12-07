(ns ogbe.fulcro.mui.icons.animation-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AnimationOutlined" :default AnimationOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-animation-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnimationOutlined)))