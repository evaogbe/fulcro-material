(ns ogbe.fulcro.mui.icons.folder-open-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FolderOpenRounded" :default FolderOpenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-open-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderOpenRounded)))