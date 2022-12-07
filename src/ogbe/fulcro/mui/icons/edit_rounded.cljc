(ns ogbe.fulcro.mui.icons.edit-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EditRounded" :default EditRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditRounded)))