(ns ogbe.fulcro.mui.icons.atm
  #?(:cljs (:require
            ["@mui/icons-material/Atm" :default Atm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-atm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Atm)))