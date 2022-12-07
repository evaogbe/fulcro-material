(ns ogbe.fulcro.mui.icons.delete-forever
  #?(:cljs (:require
            ["@mui/icons-material/DeleteForever" :default DeleteForever]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-forever
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteForever)))