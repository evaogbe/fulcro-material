(ns ogbe.fulcro.mui.icons.battery4-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery4Bar" :default Battery4Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery4-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery4Bar)))