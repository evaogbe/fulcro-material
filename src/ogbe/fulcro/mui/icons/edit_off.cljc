(ns ogbe.fulcro.mui.icons.edit-off
  #?(:cljs (:require
            ["@mui/icons-material/EditOff" :default EditOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditOff)))