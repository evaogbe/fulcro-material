(ns ogbe.fulcro.mui.icons.file-open-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FileOpenRounded" :default FileOpenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-open-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileOpenRounded)))