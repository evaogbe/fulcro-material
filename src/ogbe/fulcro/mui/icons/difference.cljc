(ns ogbe.fulcro.mui.icons.difference
  #?(:cljs (:require
            ["@mui/icons-material/Difference" :default Difference]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-difference
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Difference)))