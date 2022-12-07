(ns ogbe.fulcro.mui.icons.queue-outlined
  #?(:cljs (:require
            ["@mui/icons-material/QueueOutlined" :default QueueOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueueOutlined)))