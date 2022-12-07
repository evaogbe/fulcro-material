(ns ogbe.fulcro.mui.icons.file-copy
  #?(:cljs (:require
            ["@mui/icons-material/FileCopy" :default FileCopy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-copy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileCopy)))