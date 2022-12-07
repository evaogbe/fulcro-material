(ns ogbe.fulcro.mui.icons.compare-arrows
  #?(:cljs (:require
            ["@mui/icons-material/CompareArrows" :default CompareArrows]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-compare-arrows
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CompareArrows)))