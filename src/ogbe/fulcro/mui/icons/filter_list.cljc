(ns ogbe.fulcro.mui.icons.filter-list
  #?(:cljs (:require
            ["@mui/icons-material/FilterList" :default FilterList]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-list
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterList)))