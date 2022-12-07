(ns ogbe.fulcro.mui.icons.navigation-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NavigationOutlined" :default NavigationOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-navigation-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NavigationOutlined)))