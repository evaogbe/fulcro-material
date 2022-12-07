(ns ogbe.fulcro.mui.utils.grow
  #?(:cljs (:require
            ["@mui/material/Grow" :default Grow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-grow #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Grow)))
