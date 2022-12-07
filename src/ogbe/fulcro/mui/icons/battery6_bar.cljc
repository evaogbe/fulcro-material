(ns ogbe.fulcro.mui.icons.battery6-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery6Bar" :default Battery6Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery6-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery6Bar)))