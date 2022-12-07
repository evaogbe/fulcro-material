(ns ogbe.fulcro.mui.icons.upload-file-sharp
  #?(:cljs (:require
            ["@mui/icons-material/UploadFileSharp" :default UploadFileSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-file-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadFileSharp)))