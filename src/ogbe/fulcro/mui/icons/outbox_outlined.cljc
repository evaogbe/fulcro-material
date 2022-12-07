(ns ogbe.fulcro.mui.icons.outbox-outlined
  #?(:cljs (:require
            ["@mui/icons-material/OutboxOutlined" :default OutboxOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outbox-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutboxOutlined)))