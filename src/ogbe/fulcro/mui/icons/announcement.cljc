(ns ogbe.fulcro.mui.icons.announcement
  #?(:cljs (:require
            ["@mui/icons-material/Announcement" :default Announcement]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-announcement
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Announcement)))