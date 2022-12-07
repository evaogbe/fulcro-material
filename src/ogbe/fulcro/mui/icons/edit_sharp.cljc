(ns ogbe.fulcro.mui.icons.edit-sharp
  #?(:cljs (:require
            ["@mui/icons-material/EditSharp" :default EditSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditSharp)))