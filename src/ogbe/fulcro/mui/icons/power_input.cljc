(ns ogbe.fulcro.mui.icons.power-input
  #?(:cljs (:require
            ["@mui/icons-material/PowerInput" :default PowerInput]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power-input
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PowerInput)))