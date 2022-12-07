(ns ogbe.fulcro.mui.icons.folder-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FolderSharp" :default FolderSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderSharp)))