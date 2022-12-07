(ns ogbe.fulcro.mui.icons.queue-play-next
  #?(:cljs (:require
            ["@mui/icons-material/QueuePlayNext" :default QueuePlayNext]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue-play-next
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueuePlayNext)))