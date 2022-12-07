(ns ogbe.fulcro.mui.icons.download-done-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DownloadDoneRounded" :default DownloadDoneRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-done-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadDoneRounded)))