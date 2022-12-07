(ns ogbe.fulcro.mui.icons.file-copy-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FileCopyOutlined" :default FileCopyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-copy-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileCopyOutlined)))