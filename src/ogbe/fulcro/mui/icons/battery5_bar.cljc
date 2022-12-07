(ns ogbe.fulcro.mui.icons.battery5-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery5Bar" :default Battery5Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery5-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery5Bar)))