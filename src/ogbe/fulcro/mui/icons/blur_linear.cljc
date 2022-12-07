(ns ogbe.fulcro.mui.icons.blur-linear
  #?(:cljs (:require
            ["@mui/icons-material/BlurLinear" :default BlurLinear]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-linear
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurLinear)))