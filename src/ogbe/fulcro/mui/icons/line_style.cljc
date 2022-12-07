(ns ogbe.fulcro.mui.icons.line-style
  #?(:cljs (:require
            ["@mui/icons-material/LineStyle" :default LineStyle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-line-style
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LineStyle)))