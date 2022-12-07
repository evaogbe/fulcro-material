(ns ogbe.fulcro.mui.icons.multiline-chart
  #?(:cljs (:require
            ["@mui/icons-material/MultilineChart" :default MultilineChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-multiline-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MultilineChart)))