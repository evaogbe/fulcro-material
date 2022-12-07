(ns ogbe.fulcro.mui.icons.file-copy-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FileCopyRounded" :default FileCopyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-copy-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileCopyRounded)))