(ns ogbe.fulcro.mui.icons.download-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DownloadRounded" :default DownloadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadRounded)))