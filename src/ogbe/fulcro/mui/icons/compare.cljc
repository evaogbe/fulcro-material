(ns ogbe.fulcro.mui.icons.compare
  #?(:cljs (:require
            ["@mui/icons-material/Compare" :default Compare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-compare
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Compare)))