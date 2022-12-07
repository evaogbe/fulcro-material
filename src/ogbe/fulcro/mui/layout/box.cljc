(ns ogbe.fulcro.mui.layout.box
  #?(:cljs (:require
            ["@mui/material/Box" :default Box]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-box #?(:clj  (fn [& _args])
               :cljs (interop/react-factory Box)))
