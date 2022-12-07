(ns ogbe.fulcro.mui.icons.file-download-done
  #?(:cljs (:require
            ["@mui/icons-material/FileDownloadDone" :default FileDownloadDone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-download-done
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileDownloadDone)))