(ns ogbe.fulcro.mui.icons.document-scanner
  #?(:cljs (:require
            ["@mui/icons-material/DocumentScanner" :default DocumentScanner]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-document-scanner
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DocumentScanner)))