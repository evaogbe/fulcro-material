(ns ogbe.fulcro.mui.data-display.chip
  #?(:cljs (:require
            ["@mui/material/Chip" :default Chip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-chip #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Chip)))
