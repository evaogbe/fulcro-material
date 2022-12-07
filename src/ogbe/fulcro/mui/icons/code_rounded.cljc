(ns ogbe.fulcro.mui.icons.code-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CodeRounded" :default CodeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-code-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CodeRounded)))