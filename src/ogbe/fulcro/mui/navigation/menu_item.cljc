(ns ogbe.fulcro.mui.navigation.menu-item
  #?(:cljs (:require
            ["@mui/material/MenuItem" :default MenuItem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-menu-item #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory MenuItem)))
