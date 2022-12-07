(ns ogbe.fulcro.mui.navigation.tabs-unstyled
  #?(:cljs (:require
            ["@mui/base/TabsUnstyled" :default TabsUnstyled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tabs-unstyled #?(:clj  (fn [& _args])
                         :cljs (interop/react-factory TabsUnstyled)))
