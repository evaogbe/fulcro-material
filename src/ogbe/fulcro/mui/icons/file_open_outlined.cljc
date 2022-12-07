(ns ogbe.fulcro.mui.icons.file-open-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FileOpenOutlined" :default FileOpenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-open-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileOpenOutlined)))