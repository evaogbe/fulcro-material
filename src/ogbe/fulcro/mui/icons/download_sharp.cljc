(ns ogbe.fulcro.mui.icons.download-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DownloadSharp" :default DownloadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadSharp)))