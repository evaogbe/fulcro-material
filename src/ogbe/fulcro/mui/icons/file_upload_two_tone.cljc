(ns ogbe.fulcro.mui.icons.file-upload-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FileUploadTwoTone" :default FileUploadTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-upload-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileUploadTwoTone)))