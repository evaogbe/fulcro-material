(ns ogbe.fulcro.mui.icons.file-copy-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FileCopySharp" :default FileCopySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-copy-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileCopySharp)))