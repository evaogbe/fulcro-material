(ns ogbe.fulcro.mui.icons.queue-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/QueueTwoTone" :default QueueTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueueTwoTone)))