(ns ogbe.fulcro.mui.icons.delete-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DeleteOutlined" :default DeleteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteOutlined)))