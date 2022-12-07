(ns ogbe.fulcro.mui.icons.delete-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DeleteSharp" :default DeleteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteSharp)))