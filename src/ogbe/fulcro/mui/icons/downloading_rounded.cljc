(ns ogbe.fulcro.mui.icons.downloading-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DownloadingRounded" :default DownloadingRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-downloading-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadingRounded)))