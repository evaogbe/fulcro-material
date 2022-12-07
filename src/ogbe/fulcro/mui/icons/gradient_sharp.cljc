(ns ogbe.fulcro.mui.icons.gradient-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GradientSharp" :default GradientSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gradient-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GradientSharp)))