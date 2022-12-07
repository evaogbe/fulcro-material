(ns ogbe.fulcro.mui.icons.filter-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FilterSharp" :default FilterSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterSharp)))