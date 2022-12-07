(ns ogbe.fulcro.mui.icons.filter-none
  #?(:cljs (:require
            ["@mui/icons-material/FilterNone" :default FilterNone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-none
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterNone)))