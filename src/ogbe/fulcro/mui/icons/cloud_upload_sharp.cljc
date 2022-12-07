(ns ogbe.fulcro.mui.icons.cloud-upload-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CloudUploadSharp" :default CloudUploadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-upload-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudUploadSharp)))