(ns ogbe.fulcro.mui.icons.notifications-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NotificationsSharp" :default NotificationsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotificationsSharp)))