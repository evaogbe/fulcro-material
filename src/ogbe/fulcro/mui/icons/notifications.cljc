(ns ogbe.fulcro.mui.icons.notifications
  #?(:cljs (:require
            ["@mui/icons-material/Notifications" :default Notifications]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-notifications
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Notifications)))