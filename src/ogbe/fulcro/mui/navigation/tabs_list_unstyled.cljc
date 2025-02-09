(ns ogbe.fulcro.mui.navigation.tabs-list-unstyled
  #?(:cljs (:require
            ["@mui/material/TabsListUnstyled" :default TabsListUnstyled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tabs-list-unstyled #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory TabsListUnstyled)))
