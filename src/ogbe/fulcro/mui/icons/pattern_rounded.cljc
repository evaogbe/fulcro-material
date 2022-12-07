(ns ogbe.fulcro.mui.icons.pattern-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PatternRounded" :default PatternRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pattern-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PatternRounded)))