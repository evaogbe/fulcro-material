(ns ogbe.fulcro.mui.icons.fork-right
  #?(:cljs (:require
            ["@mui/icons-material/ForkRight" :default ForkRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fork-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ForkRight)))