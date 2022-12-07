(ns ogbe.fulcro.mui.icons.no-food
  #?(:cljs (:require
            ["@mui/icons-material/NoFood" :default NoFood]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-food
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoFood)))