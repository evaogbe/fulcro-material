(ns ogbe.fulcro.mui.icons.sort-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SortRounded" :default SortRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SortRounded)))