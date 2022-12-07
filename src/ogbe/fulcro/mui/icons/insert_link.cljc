(ns ogbe.fulcro.mui.icons.insert-link
  #?(:cljs (:require
            ["@mui/icons-material/InsertLink" :default InsertLink]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-link
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertLink)))