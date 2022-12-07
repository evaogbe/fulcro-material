(ns ogbe.fulcro.mui.icons.local-drink
  #?(:cljs (:require
            ["@mui/icons-material/LocalDrink" :default LocalDrink]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-drink
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalDrink)))