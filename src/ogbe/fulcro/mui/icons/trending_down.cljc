(ns ogbe.fulcro.mui.icons.trending-down
  #?(:cljs (:require
            ["@mui/icons-material/TrendingDown" :default TrendingDown]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-trending-down
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrendingDown)))