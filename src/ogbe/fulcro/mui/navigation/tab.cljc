(ns ogbe.fulcro.mui.navigation.tab
  #?(:cljs (:require
            ["@mui/material/Tab" :default Tab]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tab #?(:clj  (fn [& _args])
               :cljs (interop/react-factory Tab)))
