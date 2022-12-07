(ns ogbe.fulcro.mui.icons.upload-file
  #?(:cljs (:require
            ["@mui/icons-material/UploadFile" :default UploadFile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-file
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadFile)))