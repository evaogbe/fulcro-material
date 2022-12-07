(ns ogbe.fulcro.mui.icons.line-weight
  #?(:cljs (:require
            ["@mui/icons-material/LineWeight" :default LineWeight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-line-weight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LineWeight)))