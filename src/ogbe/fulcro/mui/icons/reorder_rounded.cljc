(ns ogbe.fulcro.mui.icons.reorder-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReorderRounded" :default ReorderRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reorder-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReorderRounded)))