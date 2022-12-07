(ns ogbe.fulcro.mui.icons.gradient-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/GradientTwoTone" :default GradientTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gradient-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradientTwoTone)))