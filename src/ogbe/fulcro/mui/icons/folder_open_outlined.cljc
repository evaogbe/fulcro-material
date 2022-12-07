(ns ogbe.fulcro.mui.icons.folder-open-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FolderOpenOutlined" :default FolderOpenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-open-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderOpenOutlined)))