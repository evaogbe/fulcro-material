(ns ogbe.fulcro.mui.icons.filter-none-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FilterNoneRounded" :default FilterNoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-none-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterNoneRounded)))