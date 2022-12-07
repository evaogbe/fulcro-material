(ns ogbe.fulcro.mui.icons.file-present
  #?(:cljs (:require
            ["@mui/icons-material/FilePresent" :default FilePresent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-present
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilePresent)))