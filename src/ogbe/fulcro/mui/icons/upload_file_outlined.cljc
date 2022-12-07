(ns ogbe.fulcro.mui.icons.upload-file-outlined
  #?(:cljs (:require
            ["@mui/icons-material/UploadFileOutlined" :default UploadFileOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-file-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadFileOutlined)))