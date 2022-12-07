(ns ogbe.fulcro.mui.icons.font-download
  #?(:cljs (:require
            ["@mui/icons-material/FontDownload" :default FontDownload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-font-download
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FontDownload)))