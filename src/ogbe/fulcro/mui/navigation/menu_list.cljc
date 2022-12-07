(ns ogbe.fulcro.mui.navigation.menu-list
  #?(:cljs (:require
            ["@mui/material/MenuList" :default MenuList]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-menu-list #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory MenuList)))
