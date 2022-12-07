(ns ogbe.fulcro.mui.icons.subscript
  #?(:cljs (:require
            ["@mui/icons-material/Subscript" :default Subscript]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subscript
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Subscript)))