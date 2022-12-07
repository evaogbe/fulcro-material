(ns ogbe.fulcro.mui.icons.announcement-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AnnouncementOutlined" :default AnnouncementOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-announcement-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnnouncementOutlined)))