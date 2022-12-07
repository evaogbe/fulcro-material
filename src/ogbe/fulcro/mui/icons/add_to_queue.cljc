(ns ogbe.fulcro.mui.icons.add-to-queue
  #?(:cljs (:require
            ["@mui/icons-material/AddToQueue" :default AddToQueue]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-to-queue
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddToQueue)))