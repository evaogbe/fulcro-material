(ns ogbe.fulcro.mui.icons.select-all-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SelectAllOutlined" :default SelectAllOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-select-all-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SelectAllOutlined)))