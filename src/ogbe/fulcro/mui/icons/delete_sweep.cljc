(ns ogbe.fulcro.mui.icons.delete-sweep
  #?(:cljs (:require
            ["@mui/icons-material/DeleteSweep" :default DeleteSweep]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delete-sweep
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeleteSweep)))