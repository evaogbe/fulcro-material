(ns ogbe.fulcro.mui.icons.edit-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/EditTwoTone" :default EditTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditTwoTone)))