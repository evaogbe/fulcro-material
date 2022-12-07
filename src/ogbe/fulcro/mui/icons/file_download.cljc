(ns ogbe.fulcro.mui.icons.file-download
  #?(:cljs (:require
            ["@mui/icons-material/FileDownload" :default FileDownload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-download
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileDownload)))