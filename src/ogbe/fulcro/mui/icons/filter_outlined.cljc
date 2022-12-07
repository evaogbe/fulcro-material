(ns ogbe.fulcro.mui.icons.filter-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FilterOutlined" :default FilterOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterOutlined)))