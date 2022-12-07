(ns ogbe.fulcro.mui.icons.filter-list-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FilterListOutlined" :default FilterListOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-list-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterListOutlined)))