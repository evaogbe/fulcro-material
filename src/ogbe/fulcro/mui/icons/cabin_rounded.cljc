(ns ogbe.fulcro.mui.icons.cabin-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CabinRounded" :default CabinRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cabin-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CabinRounded)))