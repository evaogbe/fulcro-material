(ns ogbe.fulcro.mui.icons.folder-zip-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FolderZipSharp" :default FolderZipSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-zip-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderZipSharp)))