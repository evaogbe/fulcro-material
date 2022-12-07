(ns ogbe.fulcro.mui.icons.folder-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FolderOutlined" :default FolderOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderOutlined)))