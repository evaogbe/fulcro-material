(ns ogbe.fulcro.mui.icons.delete-outline
  #?(:cljs (:require
            ["@mui/icons-material/DeleteOutline" :default DeleteOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteOutline)))