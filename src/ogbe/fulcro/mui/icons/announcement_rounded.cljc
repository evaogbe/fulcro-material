(ns ogbe.fulcro.mui.icons.announcement-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AnnouncementRounded" :default AnnouncementRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-announcement-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnnouncementRounded)))