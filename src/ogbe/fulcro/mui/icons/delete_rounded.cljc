(ns ogbe.fulcro.mui.icons.delete-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DeleteRounded" :default DeleteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteRounded)))