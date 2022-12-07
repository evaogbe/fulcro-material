(ns ogbe.fulcro.mui.icons.crib-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CribRounded" :default CribRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crib-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CribRounded)))