(ns ogbe.fulcro.mui.navigation.drawer
  #?(:cljs (:require
            ["@mui/material/Drawer" :default Drawer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-drawer #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Drawer)))
