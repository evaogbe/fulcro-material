(ns ogbe.fulcro.mui.icons.boy-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BoyRounded" :default BoyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-boy-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BoyRounded)))