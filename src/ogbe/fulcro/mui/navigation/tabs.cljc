(ns ogbe.fulcro.mui.navigation.tabs
  #?(:cljs (:require
            ["@mui/material/Tabs" :default Tabs]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tabs #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Tabs)))
