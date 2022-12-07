(ns ogbe.fulcro.mui.icons.fiber-new
  #?(:cljs (:require
            ["@mui/icons-material/FiberNew" :default FiberNew]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fiber-new
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiberNew)))