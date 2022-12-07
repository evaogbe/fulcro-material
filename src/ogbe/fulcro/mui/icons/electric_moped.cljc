(ns ogbe.fulcro.mui.icons.electric-moped
  #?(:cljs (:require
            ["@mui/icons-material/ElectricMoped" :default ElectricMoped]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-electric-moped
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ElectricMoped)))