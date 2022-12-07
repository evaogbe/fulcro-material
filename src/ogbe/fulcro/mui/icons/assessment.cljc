(ns ogbe.fulcro.mui.icons.assessment
  #?(:cljs (:require
            ["@mui/icons-material/Assessment" :default Assessment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assessment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Assessment)))