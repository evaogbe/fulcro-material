(ns ogbe.fulcro.mui.icons.download-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DownloadOutlined" :default DownloadOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadOutlined)))