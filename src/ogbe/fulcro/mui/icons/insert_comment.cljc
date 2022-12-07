(ns ogbe.fulcro.mui.icons.insert-comment
  #?(:cljs (:require
            ["@mui/icons-material/InsertComment" :default InsertComment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-comment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertComment)))