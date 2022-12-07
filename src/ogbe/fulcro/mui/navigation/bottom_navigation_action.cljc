(ns ogbe.fulcro.mui.navigation.bottom-navigation-action
  #?(:cljs (:require
            ["@mui/material/BottomNavigationAction" :default BottomNavigationAction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-bottom-navigation-action #?(:clj  (fn [& _args])
                                    :cljs (interop/react-factory BottomNavigationAction)))
