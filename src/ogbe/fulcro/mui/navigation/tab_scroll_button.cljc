(ns ogbe.fulcro.mui.navigation.tab-scroll-button
  #?(:cljs (:require
            ["@mui/material/TabScrollButton" :default TabScrollButton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tab-scroll-button #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory TabScrollButton)))
