(ns ogbe.fulcro.mui.icons.filter-vintage
  #?(:cljs (:require
            ["@mui/icons-material/FilterVintage" :default FilterVintage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-vintage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterVintage)))