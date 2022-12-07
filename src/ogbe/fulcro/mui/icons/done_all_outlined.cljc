(ns ogbe.fulcro.mui.icons.done-all-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DoneAllOutlined" :default DoneAllOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-all-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneAllOutlined)))