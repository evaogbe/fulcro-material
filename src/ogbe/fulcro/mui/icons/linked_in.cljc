(ns ogbe.fulcro.mui.icons.linked-in
  #?(:cljs (:require
            ["@mui/icons-material/LinkedIn" :default LinkedIn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-linked-in
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkedIn)))