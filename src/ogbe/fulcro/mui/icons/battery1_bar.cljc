(ns ogbe.fulcro.mui.icons.battery1-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery1Bar" :default Battery1Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery1-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery1Bar)))