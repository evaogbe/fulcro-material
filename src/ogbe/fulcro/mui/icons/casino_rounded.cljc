(ns ogbe.fulcro.mui.icons.casino-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CasinoRounded" :default CasinoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-casino-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CasinoRounded)))