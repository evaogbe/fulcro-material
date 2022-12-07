(ns ogbe.fulcro.mui.icons.rule-folder
  #?(:cljs (:require
            ["@mui/icons-material/RuleFolder" :default RuleFolder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rule-folder
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RuleFolder)))