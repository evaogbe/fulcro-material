(ns ogbe.fulcro.mui.icons.gradient
  #?(:cljs (:require
            ["@mui/icons-material/Gradient" :default Gradient]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gradient
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Gradient)))