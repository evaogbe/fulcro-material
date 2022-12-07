(ns ogbe.fulcro.mui.navigation.tab-unstyled
  #?(:cljs (:require
            ["@mui/base/TabUnstyled" :default TabUnstyled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tab-unstyled #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory TabUnstyled)))
