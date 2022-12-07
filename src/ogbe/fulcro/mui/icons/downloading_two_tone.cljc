(ns ogbe.fulcro.mui.icons.downloading-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DownloadingTwoTone" :default DownloadingTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-downloading-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DownloadingTwoTone)))