(ns ogbe.fulcro.mui.icons.pattern-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PatternSharp" :default PatternSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pattern-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PatternSharp)))