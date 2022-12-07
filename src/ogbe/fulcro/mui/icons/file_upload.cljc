(ns ogbe.fulcro.mui.icons.file-upload
  #?(:cljs (:require
            ["@mui/icons-material/FileUpload" :default FileUpload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-upload
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileUpload)))