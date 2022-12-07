(ns ogbe.fulcro.mui.icons.folder-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FolderTwoTone" :default FolderTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderTwoTone)))