(ns ogbe.fulcro.mui.icons.downloading-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DownloadingOutlined" :default DownloadingOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-downloading-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadingOutlined)))