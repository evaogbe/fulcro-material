(ns ogbe.fulcro.mui.icons.folder-special
  #?(:cljs (:require
            ["@mui/icons-material/FolderSpecial" :default FolderSpecial]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder-special
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FolderSpecial)))