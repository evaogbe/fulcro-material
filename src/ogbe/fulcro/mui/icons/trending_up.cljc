(ns ogbe.fulcro.mui.icons.trending-up
  #?(:cljs (:require
            ["@mui/icons-material/TrendingUp" :default TrendingUp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-trending-up
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrendingUp)))