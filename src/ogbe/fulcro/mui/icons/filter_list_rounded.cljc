(ns ogbe.fulcro.mui.icons.filter-list-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FilterListRounded" :default FilterListRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-list-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterListRounded)))