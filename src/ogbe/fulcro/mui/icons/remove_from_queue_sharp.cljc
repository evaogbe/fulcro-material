(ns ogbe.fulcro.mui.icons.remove-from-queue-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RemoveFromQueueSharp" :default RemoveFromQueueSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-from-queue-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveFromQueueSharp)))