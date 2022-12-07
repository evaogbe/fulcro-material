(ns ogbe.fulcro.mui.inputs.icon-button
  #?(:cljs (:require
            ["@mui/material/IconButton" :default IconButton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-button #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory IconButton)))
