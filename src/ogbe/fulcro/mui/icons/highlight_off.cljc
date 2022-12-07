(ns ogbe.fulcro.mui.icons.highlight-off
  #?(:cljs (:require
            ["@mui/icons-material/HighlightOff" :default HighlightOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-highlight-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HighlightOff)))