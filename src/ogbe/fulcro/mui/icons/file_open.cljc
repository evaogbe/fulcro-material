(ns ogbe.fulcro.mui.icons.file-open
  #?(:cljs (:require
            ["@mui/icons-material/FileOpen" :default FileOpen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-open
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileOpen)))