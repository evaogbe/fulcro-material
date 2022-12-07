(ns ogbe.fulcro.mui.icons.pattern-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PatternTwoTone" :default PatternTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pattern-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PatternTwoTone)))