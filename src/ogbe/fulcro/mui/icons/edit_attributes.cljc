(ns ogbe.fulcro.mui.icons.edit-attributes
  #?(:cljs (:require
            ["@mui/icons-material/EditAttributes" :default EditAttributes]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-attributes
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditAttributes)))