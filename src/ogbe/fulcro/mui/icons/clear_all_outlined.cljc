(ns ogbe.fulcro.mui.icons.clear-all-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ClearAllOutlined" :default ClearAllOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clear-all-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ClearAllOutlined)))