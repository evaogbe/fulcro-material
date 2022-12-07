(ns ogbe.fulcro.mui.icons.restore-from-trash
  #?(:cljs (:require
            ["@mui/icons-material/RestoreFromTrash" :default RestoreFromTrash]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-restore-from-trash
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RestoreFromTrash)))