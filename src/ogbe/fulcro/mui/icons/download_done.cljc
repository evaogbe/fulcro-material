(ns ogbe.fulcro.mui.icons.download-done
  #?(:cljs (:require
            ["@mui/icons-material/DownloadDone" :default DownloadDone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-done
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadDone)))