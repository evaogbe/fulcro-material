(ns ogbe.fulcro.mui.icons.queue-rounded
  #?(:cljs (:require
            ["@mui/icons-material/QueueRounded" :default QueueRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueueRounded)))