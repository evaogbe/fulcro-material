(ns ogbe.fulcro.mui.icons.notifications-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsOutlined" :default NotificationsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsOutlined)))