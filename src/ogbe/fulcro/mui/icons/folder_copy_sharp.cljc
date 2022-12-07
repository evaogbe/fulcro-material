(ns ogbe.fulcro.mui.icons.folder-copy-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FolderCopySharp" :default FolderCopySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-copy-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderCopySharp)))