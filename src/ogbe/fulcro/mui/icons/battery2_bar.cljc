(ns ogbe.fulcro.mui.icons.battery2-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery2Bar" :default Battery2Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery2-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery2Bar)))