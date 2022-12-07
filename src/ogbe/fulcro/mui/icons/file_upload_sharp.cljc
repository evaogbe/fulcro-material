(ns ogbe.fulcro.mui.icons.file-upload-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FileUploadSharp" :default FileUploadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-upload-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileUploadSharp)))