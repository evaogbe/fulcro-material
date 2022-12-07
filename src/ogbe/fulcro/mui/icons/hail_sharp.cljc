(ns ogbe.fulcro.mui.icons.hail-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HailSharp" :default HailSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hail-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HailSharp)))