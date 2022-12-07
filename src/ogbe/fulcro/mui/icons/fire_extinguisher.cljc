(ns ogbe.fulcro.mui.icons.fire-extinguisher
  #?(:cljs (:require
            ["@mui/icons-material/FireExtinguisher" :default FireExtinguisher]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fire-extinguisher
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FireExtinguisher)))