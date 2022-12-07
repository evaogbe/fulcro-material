(ns ogbe.fulcro.mui.icons.fork-left
  #?(:cljs (:require
            ["@mui/icons-material/ForkLeft" :default ForkLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fork-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ForkLeft)))