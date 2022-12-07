(ns ogbe.fulcro.mui.icons.download-for-offline
  #?(:cljs (:require
            ["@mui/icons-material/DownloadForOffline" :default DownloadForOffline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-for-offline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadForOffline)))