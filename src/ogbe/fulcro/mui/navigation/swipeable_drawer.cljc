(ns ogbe.fulcro.mui.navigation.swipeable-drawer
  #?(:cljs (:require
            ["@mui/material/SwipeableDrawer" :default SwipeableDrawer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-swipeable-drawer #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory SwipeableDrawer)))
