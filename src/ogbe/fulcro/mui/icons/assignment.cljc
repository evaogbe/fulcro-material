(ns ogbe.fulcro.mui.icons.assignment
  #?(:cljs (:require
            ["@mui/icons-material/Assignment" :default Assignment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assignment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Assignment)))