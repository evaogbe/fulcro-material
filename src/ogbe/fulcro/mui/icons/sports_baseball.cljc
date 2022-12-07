(ns ogbe.fulcro.mui.icons.sports-baseball
  #?(:cljs (:require
            ["@mui/icons-material/SportsBaseball" :default SportsBaseball]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-baseball
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsBaseball)))