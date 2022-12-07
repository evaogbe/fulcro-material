(ns ogbe.fulcro.mui.icons.rule-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RuleRounded" :default RuleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rule-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RuleRounded)))