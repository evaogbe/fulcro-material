(ns ogbe.fulcro.mui.surfaces.app-bar
  #?(:cljs (:require
            ["@mui/material/AppBar" :default AppBar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-app-bar #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory AppBar)))
