(ns ogbe.fulcro.mui.icons.compare-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CompareRounded" :default CompareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-compare-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CompareRounded)))