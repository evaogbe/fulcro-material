(ns ogbe.fulcro.mui.icons.file-download-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FileDownloadRounded" :default FileDownloadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-download-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileDownloadRounded)))