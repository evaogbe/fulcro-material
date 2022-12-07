(ns ogbe.fulcro.mui.icons.file-download-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FileDownloadSharp" :default FileDownloadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-download-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileDownloadSharp)))