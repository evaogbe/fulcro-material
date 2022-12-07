(ns ogbe.fulcro.mui.utils.popover
  #?(:cljs (:require
            ["@mui/material/Popover" :default Popover]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-popover #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Popover)))
