(ns ogbe.fulcro.mui.icons.folder-open-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FolderOpenSharp" :default FolderOpenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-open-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderOpenSharp)))