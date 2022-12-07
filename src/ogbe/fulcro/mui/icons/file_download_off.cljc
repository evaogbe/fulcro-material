(ns ogbe.fulcro.mui.icons.file-download-off
  #?(:cljs (:require
            ["@mui/icons-material/FileDownloadOff" :default FileDownloadOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-download-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileDownloadOff)))