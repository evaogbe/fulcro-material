(ns ogbe.fulcro.mui.icons.folder-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FolderRounded" :default FolderRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderRounded)))