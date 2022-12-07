(ns ogbe.fulcro.mui.icons.file-upload-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FileUploadRounded" :default FileUploadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-upload-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileUploadRounded)))