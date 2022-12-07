(ns ogbe.fulcro.mui.navigation.bottom-navigation
  #?(:cljs (:require
            ["@mui/material/BottomNavigation" :default BottomNavigation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-bottom-navigation #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory BottomNavigation)))
