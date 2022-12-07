(ns ogbe.fulcro.mui.navigation.tab-panel-unstyled
  #?(:cljs (:require
            ["@mui/base/TabPanelUnstyled" :default TabPanelUnstyled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-tab-panel-unstyled #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory TabPanelUnstyled)))
