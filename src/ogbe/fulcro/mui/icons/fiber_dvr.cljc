(ns ogbe.fulcro.mui.icons.fiber-dvr
  #?(:cljs (:require
            ["@mui/icons-material/FiberDvr" :default FiberDvr]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fiber-dvr
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiberDvr)))