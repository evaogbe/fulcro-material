(ns ogbe.fulcro.mui.icons.cloud-download
  #?(:cljs (:require
            ["@mui/icons-material/CloudDownload" :default CloudDownload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cloud-download
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloudDownload)))