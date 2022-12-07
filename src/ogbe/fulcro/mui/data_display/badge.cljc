(ns ogbe.fulcro.mui.data-display.badge
  #?(:cljs (:require
            ["@mui/material/Badge" :default Badge]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-badge #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Badge)))
