(ns ogbe.fulcro.mui.icons.copy-all-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CopyAllOutlined" :default CopyAllOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copy-all-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CopyAllOutlined)))