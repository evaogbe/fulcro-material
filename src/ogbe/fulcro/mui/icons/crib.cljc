(ns ogbe.fulcro.mui.icons.crib
  #?(:cljs (:require
            ["@mui/icons-material/Crib" :default Crib]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crib
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Crib)))