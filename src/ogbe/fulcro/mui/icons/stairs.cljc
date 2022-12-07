(ns ogbe.fulcro.mui.icons.stairs
  #?(:cljs (:require
            ["@mui/icons-material/Stairs" :default Stairs]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stairs
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Stairs)))