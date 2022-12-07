(ns ogbe.fulcro.mui.icons.announcement-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AnnouncementSharp" :default AnnouncementSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-announcement-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnnouncementSharp)))