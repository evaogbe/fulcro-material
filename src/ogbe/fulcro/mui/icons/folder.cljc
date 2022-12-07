(ns ogbe.fulcro.mui.icons.folder
  #?(:cljs (:require
            ["@mui/icons-material/Folder" :default Folder]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-folder
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Folder)))