(ns ogbe.fulcro.mui.icons.square-foot
  #?(:cljs (:require
            ["@mui/icons-material/SquareFoot" :default SquareFoot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-square-foot
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SquareFoot)))