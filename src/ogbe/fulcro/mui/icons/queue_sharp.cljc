(ns ogbe.fulcro.mui.icons.queue-sharp
  #?(:cljs (:require
            ["@mui/icons-material/QueueSharp" :default QueueSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueueSharp)))