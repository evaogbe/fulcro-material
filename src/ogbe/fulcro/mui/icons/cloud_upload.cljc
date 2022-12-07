(ns ogbe.fulcro.mui.icons.cloud-upload
  #?(:cljs (:require
            ["@mui/icons-material/CloudUpload" :default CloudUpload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-upload
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudUpload)))