(ns ogbe.fulcro.mui.icons.folder-zip-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FolderZipOutlined" :default FolderZipOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-zip-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderZipOutlined)))