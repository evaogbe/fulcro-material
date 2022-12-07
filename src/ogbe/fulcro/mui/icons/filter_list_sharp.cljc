(ns ogbe.fulcro.mui.icons.filter-list-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FilterListSharp" :default FilterListSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-list-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterListSharp)))