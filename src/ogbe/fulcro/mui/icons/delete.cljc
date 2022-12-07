(ns ogbe.fulcro.mui.icons.delete
  #?(:cljs (:require
            ["@mui/icons-material/Delete" :default Delete]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Delete)))