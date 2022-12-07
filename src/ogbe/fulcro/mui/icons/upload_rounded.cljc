(ns ogbe.fulcro.mui.icons.upload-rounded
  #?(:cljs (:require
            ["@mui/icons-material/UploadRounded" :default UploadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadRounded)))