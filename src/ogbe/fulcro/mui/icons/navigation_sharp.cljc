(ns ogbe.fulcro.mui.icons.navigation-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NavigationSharp" :default NavigationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-navigation-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NavigationSharp)))