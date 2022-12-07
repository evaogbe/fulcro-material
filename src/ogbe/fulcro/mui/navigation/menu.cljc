(ns ogbe.fulcro.mui.navigation.menu
  #?(:cljs (:require
            ["@mui/material/Menu" :default Menu]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-menu #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Menu)))
