(ns ogbe.fulcro.mui.icons.nat-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NatRounded" :default NatRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nat-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NatRounded)))