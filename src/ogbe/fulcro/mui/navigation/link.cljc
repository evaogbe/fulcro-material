(ns ogbe.fulcro.mui.navigation.link
  #?(:cljs (:require
            ["@mui/material/Link" :default Link]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-link #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Link)))
