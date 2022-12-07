(ns ogbe.fulcro.mui.utils.zoom
  #?(:cljs (:require
            ["@mui/material/Zoom" :default Zoom]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-zoom #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Zoom)))
