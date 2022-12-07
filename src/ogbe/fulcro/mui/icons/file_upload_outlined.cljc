(ns ogbe.fulcro.mui.icons.file-upload-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FileUploadOutlined" :default FileUploadOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-upload-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileUploadOutlined)))