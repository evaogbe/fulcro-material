(ns ogbe.fulcro.mui.icons.filter-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FilterTwoTone" :default FilterTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterTwoTone)))