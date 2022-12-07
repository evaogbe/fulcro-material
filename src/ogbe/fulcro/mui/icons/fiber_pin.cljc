(ns ogbe.fulcro.mui.icons.fiber-pin
  #?(:cljs (:require
            ["@mui/icons-material/FiberPin" :default FiberPin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fiber-pin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiberPin)))