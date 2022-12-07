(ns ogbe.fulcro.mui.icons.file-open-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FileOpenSharp" :default FileOpenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-file-open-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FileOpenSharp)))