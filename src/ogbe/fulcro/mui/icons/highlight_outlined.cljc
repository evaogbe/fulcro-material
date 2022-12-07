(ns ogbe.fulcro.mui.icons.highlight-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HighlightOutlined" :default HighlightOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-highlight-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HighlightOutlined)))