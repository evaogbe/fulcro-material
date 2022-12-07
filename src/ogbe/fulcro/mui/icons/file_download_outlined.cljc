(ns ogbe.fulcro.mui.icons.file-download-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FileDownloadOutlined" :default FileDownloadOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-download-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileDownloadOutlined)))