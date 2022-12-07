(ns ogbe.fulcro.mui.icons.folder-open
  #?(:cljs (:require
            ["@mui/icons-material/FolderOpen" :default FolderOpen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-open
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderOpen)))