(ns ogbe.fulcro.mui.icons.edit-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EditOutlined" :default EditOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditOutlined)))