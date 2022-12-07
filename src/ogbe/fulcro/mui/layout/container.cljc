(ns ogbe.fulcro.mui.layout.container
  #?(:cljs (:require
            ["@mui/material/Container" :default Container]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-container #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory Container)))
