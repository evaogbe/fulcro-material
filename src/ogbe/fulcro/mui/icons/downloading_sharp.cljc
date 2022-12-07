(ns ogbe.fulcro.mui.icons.downloading-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DownloadingSharp" :default DownloadingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-downloading-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadingSharp)))