(ns ogbe.fulcro.mui.icons.trending-flat
  #?(:cljs (:require
            ["@mui/icons-material/TrendingFlat" :default TrendingFlat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-trending-flat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TrendingFlat)))