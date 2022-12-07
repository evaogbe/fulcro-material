(ns ogbe.fulcro.mui.icons.numbers-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NumbersSharp" :default NumbersSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-numbers-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NumbersSharp)))