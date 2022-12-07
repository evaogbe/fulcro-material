(ns ogbe.fulcro.mui.icons.grade
  #?(:cljs (:require
            ["@mui/icons-material/Grade" :default Grade]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grade
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Grade)))