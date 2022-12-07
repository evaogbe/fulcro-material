(ns ogbe.fulcro.mui.icons.nat
  #?(:cljs (:require
            ["@mui/icons-material/Nat" :default Nat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Nat)))