(ns ogbe.fulcro.mui.icons.notifications-active
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsActive" :default NotificationsActive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-active
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsActive)))