(ns ogbe.fulcro.mui.icons.remove-from-queue
  #?(:cljs (:require
            ["@mui/icons-material/RemoveFromQueue" :default RemoveFromQueue]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-from-queue
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveFromQueue)))