(ns ogbe.fulcro.mui.icons.sports-score
  #?(:cljs (:require
            ["@mui/icons-material/SportsScore" :default SportsScore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-score
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsScore)))