(ns ogbe.fulcro.mui.icons.announcement-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AnnouncementTwoTone" :default AnnouncementTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-announcement-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnnouncementTwoTone)))