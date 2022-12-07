(ns ogbe.fulcro.mui.icons.sort-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SortOutlined" :default SortOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sort-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SortOutlined)))