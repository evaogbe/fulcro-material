(ns ogbe.fulcro.mui.icons.import-export
  #?(:cljs (:require
            ["@mui/icons-material/ImportExport" :default ImportExport]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-import-export
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImportExport)))