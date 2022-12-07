(ns ogbe.fulcro.mui.icons.queue-music
  #?(:cljs (:require
            ["@mui/icons-material/QueueMusic" :default QueueMusic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue-music
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory QueueMusic)))