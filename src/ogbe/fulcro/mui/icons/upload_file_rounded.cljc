(ns ogbe.fulcro.mui.icons.upload-file-rounded
  #?(:cljs (:require
            ["@mui/icons-material/UploadFileRounded" :default UploadFileRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-file-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadFileRounded)))