(ns ogbe.fulcro.mui.icons.folder-off
  #?(:cljs (:require
            ["@mui/icons-material/FolderOff" :default FolderOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderOff)))