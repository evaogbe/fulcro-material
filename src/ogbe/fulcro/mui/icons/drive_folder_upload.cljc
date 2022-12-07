(ns ogbe.fulcro.mui.icons.drive-folder-upload
  #?(:cljs (:require
            ["@mui/icons-material/DriveFolderUpload" :default DriveFolderUpload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-drive-folder-upload
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DriveFolderUpload)))