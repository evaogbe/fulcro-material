(ns ogbe.fulcro.mui.icons.topic
  #?(:cljs (:require
            ["@mui/icons-material/Topic" :default Topic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-topic
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Topic)))