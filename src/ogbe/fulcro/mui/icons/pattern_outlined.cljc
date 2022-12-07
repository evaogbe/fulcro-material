(ns ogbe.fulcro.mui.icons.pattern-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PatternOutlined" :default PatternOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pattern-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PatternOutlined)))