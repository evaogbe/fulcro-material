(ns ogbe.fulcro.mui.icons.notification-add-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NotificationAddRounded" :default NotificationAddRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notification-add-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationAddRounded)))