(ns ogbe.fulcro.mui.icons.notifications-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsTwoTone" :default NotificationsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsTwoTone)))