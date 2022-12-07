(ns ogbe.fulcro.mui.icons.square-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SquareRounded" :default SquareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-square-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SquareRounded)))