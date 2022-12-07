(ns ogbe.fulcro.mui.icons.stairs-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StairsRounded" :default StairsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stairs-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StairsRounded)))