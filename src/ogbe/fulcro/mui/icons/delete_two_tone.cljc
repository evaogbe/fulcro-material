(ns ogbe.fulcro.mui.icons.delete-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DeleteTwoTone" :default DeleteTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteTwoTone)))