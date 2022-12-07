(ns ogbe.fulcro.mui.icons.edit-location
  #?(:cljs (:require
            ["@mui/icons-material/EditLocation" :default EditLocation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-location
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditLocation)))