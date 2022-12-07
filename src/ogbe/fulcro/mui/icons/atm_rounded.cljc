(ns ogbe.fulcro.mui.icons.atm-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AtmRounded" :default AtmRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-atm-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AtmRounded)))