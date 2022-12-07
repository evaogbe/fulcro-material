(ns ogbe.fulcro.mui.icons.upload-outlined
  #?(:cljs (:require
            ["@mui/icons-material/UploadOutlined" :default UploadOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upload-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UploadOutlined)))