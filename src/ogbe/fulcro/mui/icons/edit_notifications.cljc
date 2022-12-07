(ns ogbe.fulcro.mui.icons.edit-notifications
  #?(:cljs (:require
            ["@mui/icons-material/EditNotifications" :default EditNotifications]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-edit-notifications
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EditNotifications)))