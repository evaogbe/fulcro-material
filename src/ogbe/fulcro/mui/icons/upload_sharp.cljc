(ns ogbe.fulcro.mui.icons.upload-sharp
  #?(:cljs (:require
            ["@mui/icons-material/UploadSharp" :default UploadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadSharp)))