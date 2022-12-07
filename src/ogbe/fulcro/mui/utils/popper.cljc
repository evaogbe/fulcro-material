(ns ogbe.fulcro.mui.utils.popper
  #?(:cljs (:require
            ["@mui/material/Poppper" :default Popper]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-popper #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Popper)))
