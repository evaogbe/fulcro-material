(ns ogbe.fulcro.mui.icons.download-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DownloadTwoTone" :default DownloadTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadTwoTone)))