(ns ogbe.fulcro.mui.icons.folder-zip
  #?(:cljs (:require
            ["@mui/icons-material/FolderZip" :default FolderZip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-zip
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderZip)))