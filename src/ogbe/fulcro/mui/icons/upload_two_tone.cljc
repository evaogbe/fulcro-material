(ns ogbe.fulcro.mui.icons.upload-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/UploadTwoTone" :default UploadTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadTwoTone)))