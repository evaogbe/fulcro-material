(ns ogbe.fulcro.mui.icons.folder-zip-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FolderZipRounded" :default FolderZipRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-zip-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderZipRounded)))