(ns ogbe.fulcro.mui.icons.loop-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LoopRounded" :default LoopRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loop-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LoopRounded)))