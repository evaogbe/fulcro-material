(ns ogbe.fulcro.mui.icons.navigation-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NavigationRounded" :default NavigationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-navigation-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NavigationRounded)))