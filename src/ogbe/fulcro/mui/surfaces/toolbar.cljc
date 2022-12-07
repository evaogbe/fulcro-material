(ns ogbe.fulcro.mui.surfaces.toolbar
  #?(:cljs (:require
            ["@mui/material/Toolbar" :default Toolbar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-toolbar #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Toolbar)))
