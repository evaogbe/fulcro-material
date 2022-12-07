(ns ogbe.fulcro.mui.icons.numbers-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NumbersRounded" :default NumbersRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-numbers-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NumbersRounded)))