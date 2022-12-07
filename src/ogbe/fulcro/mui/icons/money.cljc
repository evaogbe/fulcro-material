(ns ogbe.fulcro.mui.icons.money
  #?(:cljs (:require
            ["@mui/icons-material/Money" :default Money]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-money
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Money)))