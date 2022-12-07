(ns ogbe.fulcro.mui.icons.filter-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FilterRounded" :default FilterRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterRounded)))