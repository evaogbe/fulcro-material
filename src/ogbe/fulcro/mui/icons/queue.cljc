(ns ogbe.fulcro.mui.icons.queue
  #?(:cljs (:require
            ["@mui/icons-material/Queue" :default Queue]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-queue
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Queue)))