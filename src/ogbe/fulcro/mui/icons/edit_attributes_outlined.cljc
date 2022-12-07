(ns ogbe.fulcro.mui.icons.edit-attributes-outlined
  #?(:cljs (:require
            ["@mui/icons-material/EditAttributesOutlined" :default EditAttributesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-attributes-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditAttributesOutlined)))