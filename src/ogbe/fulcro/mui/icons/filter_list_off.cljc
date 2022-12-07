(ns ogbe.fulcro.mui.icons.filter-list-off
  #?(:cljs (:require
            ["@mui/icons-material/FilterListOff" :default FilterListOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-list-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterListOff)))