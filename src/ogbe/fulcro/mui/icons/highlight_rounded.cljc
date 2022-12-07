(ns ogbe.fulcro.mui.icons.highlight-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HighlightRounded" :default HighlightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-highlight-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HighlightRounded)))