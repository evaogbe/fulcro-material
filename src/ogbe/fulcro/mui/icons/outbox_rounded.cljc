(ns ogbe.fulcro.mui.icons.outbox-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OutboxRounded" :default OutboxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbox-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboxRounded)))