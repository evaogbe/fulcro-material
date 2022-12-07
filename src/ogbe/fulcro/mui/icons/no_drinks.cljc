(ns ogbe.fulcro.mui.icons.no-drinks
  #?(:cljs (:require
            ["@mui/icons-material/NoDrinks" :default NoDrinks]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-drinks
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoDrinks)))